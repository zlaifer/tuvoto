/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package votasys;

/**
 *
 * @author zlaifer
 */
public class usuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form candidatos
     */
    public usuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tex_codigo = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel3 = new javax.swing.JLabel();
        tex_nombres = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel4 = new javax.swing.JLabel();
        tex_pass = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jSeparator1 = new javax.swing.JSeparator();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        jLabel5 = new javax.swing.JLabel();
        combo_tipousu = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tex_buscar = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tex_imagen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(948, 599));
        setPreferredSize(new java.awt.Dimension(948, 599));
        getContentPane().setLayout(null);

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnnuevo2-mod.png"))); // NOI18N
        btn_nuevo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_nuevoMouseMoved(evt);
            }
        });
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo);
        btn_nuevo.setBounds(110, 480, 100, 49);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar2.png"))); // NOI18N
        btn_guardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_guardarMouseMoved(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(210, 480, 100, 50);

        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar2.png"))); // NOI18N
        btn_borrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_borrarMouseMoved(evt);
            }
        });
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrar);
        btn_borrar.setBounds(410, 480, 100, 49);

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar2.png"))); // NOI18N
        btn_cancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseMoved(evt);
            }
        });
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar);
        btn_cancelar.setBounds(510, 480, 100, 49);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/V_exit-mod_1.png"))); // NOI18N
        btn_salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_salirMouseMoved(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir);
        btn_salir.setBounds(710, 480, 100, 49);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("IDENTIFICACION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 50, 110, 30);
        getContentPane().add(tex_codigo);
        tex_codigo.setBounds(240, 50, 240, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("BUSCAR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 230, 48, 30);

        tex_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_nombresActionPerformed(evt);
            }
        });
        getContentPane().add(tex_nombres);
        tex_nombres.setBounds(240, 130, 240, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 90, 69, 30);
        getContentPane().add(tex_pass);
        tex_pass.setBounds(240, 90, 240, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(90, 220, 740, 10);

        labelMetric1.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric1.setText(" ADMINISTRACION DE USUARIOS");
        labelMetric1.setColorDeSombra(new java.awt.Color(204, 204, 204));
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(labelMetric1);
        labelMetric1.setBounds(-30, 0, 980, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("APELLIDOS/NOMBRES");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 130, 140, 30);

        combo_tipousu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INVITADO", "ADMINISTRADOR" }));
        combo_tipousu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipousuActionPerformed(evt);
            }
        });
        getContentPane().add(combo_tipousu);
        combo_tipousu.setBounds(240, 170, 240, 30);

        table_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_usuarioMouseClicked(evt);
            }
        });
        table_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_usuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_usuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                table_usuarioKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(table_usuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 260, 810, 180);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("TIPO DE USUARIO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 170, 130, 30);

        tex_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_buscarActionPerformed(evt);
            }
        });
        tex_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tex_buscarKeyReleased(evt);
            }
        });
        getContentPane().add(tex_buscar);
        tex_buscar.setBounds(130, 230, 740, 30);

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar2.png"))); // NOI18N
        btn_modificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_modificarMouseMoved(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar);
        btn_modificar.setBounds(310, 480, 100, 49);

        btn_exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/V_imprimir-mod.png"))); // NOI18N
        btn_exportar.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                btn_exportarMouseWheelMoved(evt);
            }
        });
        btn_exportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_exportarMouseReleased(evt);
            }
        });
        btn_exportar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_exportarMouseMoved(evt);
            }
        });
        btn_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exportar);
        btn_exportar.setBounds(610, 480, 100, 49);

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 470, 720, 70);

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 850, 420);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/V_fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 940, 570);

        tex_imagen.setEditable(false);
        tex_imagen.setBackground(new java.awt.Color(204, 255, 204));
        tex_imagen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tex_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_imagenActionPerformed(evt);
            }
        });
        getContentPane().add(tex_imagen);
        tex_imagen.setBounds(550, 170, 150, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMouseMoved
        btn_nuevo.setToolTipText("CREAR USUARIO");
    }//GEN-LAST:event_btn_nuevoMouseMoved

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
       
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_guardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseMoved
        btn_guardar.setToolTipText("GUARDAR CANDIDATO");
    }//GEN-LAST:event_btn_guardarMouseMoved

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
     
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_borrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_borrarMouseMoved
        btn_borrar.setToolTipText("ELIMINAR CANDIDATO");
    }//GEN-LAST:event_btn_borrarMouseMoved

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_cancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseMoved
        btn_cancelar.setToolTipText("CANCELAR");
    }//GEN-LAST:event_btn_cancelarMouseMoved

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        

    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseMoved
        btn_salir.setToolTipText("SALIR");
    }//GEN-LAST:event_btn_salirMouseMoved

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
     
    }//GEN-LAST:event_btn_salirActionPerformed

    private void tex_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_nombresActionPerformed

    private void combo_tipousuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipousuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipousuActionPerformed

    private void table_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_usuarioMouseClicked
      
    }//GEN-LAST:event_table_usuarioMouseClicked

    private void table_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_usuarioKeyPressed

    }//GEN-LAST:event_table_usuarioKeyPressed

    private void table_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_usuarioKeyReleased
       
    }//GEN-LAST:event_table_usuarioKeyReleased

    private void table_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_usuarioKeyTyped
        //        obtenerdatostabla();
        //        obtenerimagen();
    }//GEN-LAST:event_table_usuarioKeyTyped

    private void tex_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_buscarActionPerformed

    private void tex_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_buscarKeyReleased
       
    }//GEN-LAST:event_tex_buscarKeyReleased

    private void btn_modificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseMoved
        btn_modificar.setToolTipText("ACTUALIZAR USUARIO");
    }//GEN-LAST:event_btn_modificarMouseMoved

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
     
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void tex_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_imagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_imagenActionPerformed

    private void btn_exportarMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_btn_exportarMouseWheelMoved

    }//GEN-LAST:event_btn_exportarMouseWheelMoved

    private void btn_exportarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exportarMouseReleased

    }//GEN-LAST:event_btn_exportarMouseReleased

    private void btn_exportarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exportarMouseMoved
        btn_exportar.setToolTipText("EXPORTAR A EXCEL");
    }//GEN-LAST:event_btn_exportarMouseMoved

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
       
    }//GEN-LAST:event_btn_exportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox combo_tipousu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private javax.swing.JTable table_usuario;
    private javax.swing.JTextField tex_buscar;
    private org.edisoncor.gui.textField.TextFieldRoundImage tex_codigo;
    private javax.swing.JTextField tex_imagen;
    private org.edisoncor.gui.textField.TextFieldRoundImage tex_nombres;
    private org.edisoncor.gui.textField.TextFieldRoundImage tex_pass;
    // End of variables declaration//GEN-END:variables
}
