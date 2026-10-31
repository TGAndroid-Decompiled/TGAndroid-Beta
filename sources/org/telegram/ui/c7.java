package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.gk0 {
    public final org.telegram.ui.Components.tk0 f36403a;
    public final d7 f36404b;

    public c7(d7 d7Var, org.telegram.ui.Components.tk0 tk0Var) {
        this.f36404b = d7Var;
        this.f36403a = tk0Var;
    }

    @Override
    public final void f(int i10, View view) {
        t7 t7Var = this.f36404b.f36633f;
        org.telegram.ui.Components.tk0 tk0Var = this.f36403a;
        f7 f7Var = (f7) tk0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            t7.a(t7Var, m7Var, (o7) f7Var, tk0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.a(m7Var.f39493c, m7Var.d, false);
        }
    }
}
