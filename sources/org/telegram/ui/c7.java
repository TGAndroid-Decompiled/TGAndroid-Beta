package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.qj0 {
    public final org.telegram.ui.Components.ek0 f46725a;
    public final d7 f46726b;

    public c7(d7 d7Var, org.telegram.ui.Components.ek0 ek0Var) {
        this.f46726b = d7Var;
        this.f46725a = ek0Var;
    }

    @Override
    public final void b(int i7, View view) {
        t7 t7Var = this.f46726b.f46964f;
        org.telegram.ui.Components.ek0 ek0Var = this.f46725a;
        f7 f7Var = (f7) ek0Var.getAdapter();
        m7 m7Var = (m7) f7Var.f47709e.get(i7);
        if (view instanceof org.telegram.ui.Cells.o7) {
            t7.a(t7Var, m7Var, (o7) f7Var, ek0Var);
            return;
        }
        i7 i7Var = t7Var.G;
        if (i7Var != null) {
            i7Var.O(m7Var.f49973c, m7Var.d, false);
        }
    }
}
