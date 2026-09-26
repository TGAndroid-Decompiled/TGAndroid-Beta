package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.ll0 {
    public final org.telegram.ui.Components.xl0 f33046a;
    public final e7 f33047b;

    public d7(e7 e7Var, org.telegram.ui.Components.xl0 xl0Var) {
        this.f33047b = e7Var;
        this.f33046a = xl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        s7 s7Var = this.f33047b.d;
        org.telegram.ui.Components.xl0 xl0Var = this.f33046a;
        f7 f7Var = (f7) xl0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            s7.a(s7Var, m7Var, (o7) f7Var, xl0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.H0(m7Var.f35492c, m7Var.d, false);
        }
    }
}
