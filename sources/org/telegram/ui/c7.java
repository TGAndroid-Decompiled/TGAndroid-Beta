package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.hk0 {
    public final org.telegram.ui.Components.uk0 f36212a;
    public final d7 f36213b;

    public c7(d7 d7Var, org.telegram.ui.Components.uk0 uk0Var) {
        this.f36213b = d7Var;
        this.f36212a = uk0Var;
    }

    @Override
    public final void f(int i10, View view) {
        t7 t7Var = this.f36213b.f36511f;
        org.telegram.ui.Components.uk0 uk0Var = this.f36212a;
        f7 f7Var = (f7) uk0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            t7.a(t7Var, m7Var, (o7) f7Var, uk0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.a(m7Var.f39449c, m7Var.d, false);
        }
    }
}
