package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.nl0 {
    public final org.telegram.ui.Components.zl0 f33125a;
    public final e7 f33126b;

    public d7(e7 e7Var, org.telegram.ui.Components.zl0 zl0Var) {
        this.f33126b = e7Var;
        this.f33125a = zl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        s7 s7Var = this.f33126b.d;
        org.telegram.ui.Components.zl0 zl0Var = this.f33125a;
        f7 f7Var = (f7) zl0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            s7.a(s7Var, m7Var, (o7) f7Var, zl0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.H0(m7Var.f35583c, m7Var.d, false);
        }
    }
}
