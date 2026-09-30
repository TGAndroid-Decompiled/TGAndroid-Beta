package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.ml0 {
    public final org.telegram.ui.Components.yl0 f33047a;
    public final e7 f33048b;

    public d7(e7 e7Var, org.telegram.ui.Components.yl0 yl0Var) {
        this.f33048b = e7Var;
        this.f33047a = yl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        s7 s7Var = this.f33048b.d;
        org.telegram.ui.Components.yl0 yl0Var = this.f33047a;
        f7 f7Var = (f7) yl0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            s7.a(s7Var, m7Var, (o7) f7Var, yl0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.H0(m7Var.f35496c, m7Var.d, false);
        }
    }
}
