package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.ml0 {
    public final org.telegram.ui.Components.yl0 f32968a;
    public final e7 f32969b;

    public d7(e7 e7Var, org.telegram.ui.Components.yl0 yl0Var) {
        this.f32969b = e7Var;
        this.f32968a = yl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        t7 t7Var = this.f32969b.e;
        org.telegram.ui.Components.yl0 yl0Var = this.f32968a;
        g7 g7Var = (g7) yl0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.u7) {
            t7.a(t7Var, n7Var, (p7) g7Var, yl0Var);
            return;
        }
        j7 j7Var = t7Var.E;
        if (j7Var != null) {
            j7Var.H0(n7Var.f35921c, n7Var.d, false);
        }
    }
}
