package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.gj0 {
    public final org.telegram.ui.Components.uj0 f46028a;
    public final d7 f46029b;

    public c7(d7 d7Var, org.telegram.ui.Components.uj0 uj0Var) {
        this.f46029b = d7Var;
        this.f46028a = uj0Var;
    }

    @Override
    public final void b(int i7, View view) {
        t7 t7Var = this.f46029b.f46298f;
        org.telegram.ui.Components.uj0 uj0Var = this.f46028a;
        f7 f7Var = (f7) uj0Var.getAdapter();
        m7 m7Var = (m7) f7Var.f47004e.get(i7);
        if (view instanceof org.telegram.ui.Cells.n7) {
            t7.a(t7Var, m7Var, (o7) f7Var, uj0Var);
            return;
        }
        i7 i7Var = t7Var.G;
        if (i7Var != null) {
            i7Var.N(m7Var.f49142c, m7Var.d, false);
        }
    }
}
