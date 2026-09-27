package org.telegram.ui;

import android.view.View;
public final class f7 implements org.telegram.ui.Components.ml0 {
    public final org.telegram.ui.Components.yl0 f33444a;
    public final g7 f33445b;

    public f7(g7 g7Var, org.telegram.ui.Components.yl0 yl0Var) {
        this.f33445b = g7Var;
        this.f33444a = yl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        v7 v7Var = this.f33445b.e;
        org.telegram.ui.Components.yl0 yl0Var = this.f33444a;
        i7 i7Var = (i7) yl0Var.getAdapter();
        p7 p7Var = (p7) i7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            v7.a(v7Var, p7Var, (r7) i7Var, yl0Var);
            return;
        }
        l7 l7Var = v7Var.E;
        if (l7Var != null) {
            l7Var.H0(p7Var.f36340c, p7Var.d, false);
        }
    }
}
