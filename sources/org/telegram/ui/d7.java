package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.jl0 {
    public final org.telegram.ui.Components.vl0 f32947a;
    public final e7 f32948b;

    public d7(e7 e7Var, org.telegram.ui.Components.vl0 vl0Var) {
        this.f32948b = e7Var;
        this.f32947a = vl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        t7 t7Var = this.f32948b.e;
        org.telegram.ui.Components.vl0 vl0Var = this.f32947a;
        g7 g7Var = (g7) vl0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.u7) {
            t7.a(t7Var, n7Var, (p7) g7Var, vl0Var);
            return;
        }
        j7 j7Var = t7Var.E;
        if (j7Var != null) {
            j7Var.H0(n7Var.f35900c, n7Var.d, false);
        }
    }
}
