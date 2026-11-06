package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.bj0 {
    public final org.telegram.ui.Components.pj0 f44707a;
    public final d7 f44708b;

    public c7(d7 d7Var, org.telegram.ui.Components.pj0 pj0Var) {
        this.f44708b = d7Var;
        this.f44707a = pj0Var;
    }

    @Override
    public final void c(int i7, View view) {
        t7 t7Var = this.f44708b.f44975f;
        org.telegram.ui.Components.pj0 pj0Var = this.f44707a;
        f7 f7Var = (f7) pj0Var.getAdapter();
        m7 m7Var = (m7) f7Var.f45509e.get(i7);
        if (view instanceof org.telegram.ui.Cells.o7) {
            t7.a(t7Var, m7Var, (o7) f7Var, pj0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.o(m7Var.f47691c, m7Var.d, false);
        }
    }
}
