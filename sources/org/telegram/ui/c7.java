package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.bj0 {
    public final org.telegram.ui.Components.pj0 f44709a;
    public final d7 f44710b;

    public c7(d7 d7Var, org.telegram.ui.Components.pj0 pj0Var) {
        this.f44710b = d7Var;
        this.f44709a = pj0Var;
    }

    @Override
    public final void c(int i7, View view) {
        t7 t7Var = this.f44710b.f44979f;
        org.telegram.ui.Components.pj0 pj0Var = this.f44709a;
        f7 f7Var = (f7) pj0Var.getAdapter();
        m7 m7Var = (m7) f7Var.f45467e.get(i7);
        if (view instanceof org.telegram.ui.Cells.o7) {
            t7.a(t7Var, m7Var, (o7) f7Var, pj0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.o(m7Var.f47687c, m7Var.d, false);
        }
    }
}
