package org.telegram.ui;

import android.view.View;
public final class f7 implements org.telegram.ui.Components.jl0 {
    public final org.telegram.ui.Components.tl0 f36769a;
    public final g7 f36770b;

    public f7(g7 g7Var, org.telegram.ui.Components.tl0 tl0Var) {
        this.f36770b = g7Var;
        this.f36769a = tl0Var;
    }

    @Override
    public final void f(int i10, View view) {
        u7 u7Var = this.f36770b.d;
        org.telegram.ui.Components.tl0 tl0Var = this.f36769a;
        h7 h7Var = (h7) tl0Var.getAdapter();
        o7 o7Var = (o7) h7Var.f37339e.get(i10);
        if (view instanceof org.telegram.ui.Cells.r7) {
            u7.a(u7Var, o7Var, (q7) h7Var, tl0Var);
            return;
        }
        k7 k7Var = u7Var.v;
        if (k7Var != null) {
            k7Var.Y(o7Var.f39607c, o7Var.d, false);
        }
    }
}
