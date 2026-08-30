package org.telegram.ui;

import android.view.View;
public final class f7 implements org.telegram.ui.Components.il0 {
    public final org.telegram.ui.Components.sl0 f34177a;
    public final g7 f34178b;

    public f7(g7 g7Var, org.telegram.ui.Components.sl0 sl0Var) {
        this.f34178b = g7Var;
        this.f34177a = sl0Var;
    }

    @Override
    public final void f(int i10, View view) {
        u7 u7Var = this.f34178b.d;
        org.telegram.ui.Components.sl0 sl0Var = this.f34177a;
        h7 h7Var = (h7) sl0Var.getAdapter();
        o7 o7Var = (o7) h7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.r7) {
            u7.a(u7Var, o7Var, (q7) h7Var, sl0Var);
            return;
        }
        k7 k7Var = u7Var.v;
        if (k7Var != null) {
            k7Var.r(o7Var.f36801c, o7Var.d, false);
        }
    }
}
