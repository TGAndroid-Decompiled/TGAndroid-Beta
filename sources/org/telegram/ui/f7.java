package org.telegram.ui;

import android.view.View;
public final class f7 implements org.telegram.ui.Components.km0 {
    public final org.telegram.ui.Components.wm0 f37653a;
    public final g7 f37654b;

    public f7(g7 g7Var, org.telegram.ui.Components.wm0 wm0Var) {
        this.f37654b = g7Var;
        this.f37653a = wm0Var;
    }

    @Override
    public final void d(int i10, View view) {
        u7 u7Var = this.f37654b.d;
        org.telegram.ui.Components.wm0 wm0Var = this.f37653a;
        h7 h7Var = (h7) wm0Var.getAdapter();
        o7 o7Var = (o7) h7Var.f38270e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            u7.a(u7Var, o7Var, (q7) h7Var, wm0Var);
            return;
        }
        k7 k7Var = u7Var.v;
        if (k7Var != null) {
            k7Var.y0(o7Var.f40566c, o7Var.d, false);
        }
    }
}
