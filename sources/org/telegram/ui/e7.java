package org.telegram.ui;

import android.view.View;
public final class e7 implements org.telegram.ui.Components.ml0 {
    public final org.telegram.ui.Components.zl0 f35955a;
    public final f7 f35956b;

    public e7(f7 f7Var, org.telegram.ui.Components.zl0 zl0Var) {
        this.f35956b = f7Var;
        this.f35955a = zl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        v7 v7Var = this.f35956b.f36212f;
        org.telegram.ui.Components.zl0 zl0Var = this.f35955a;
        h7 h7Var = (h7) zl0Var.getAdapter();
        o7 o7Var = (o7) h7Var.f36992e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            v7.a(v7Var, o7Var, (q7) h7Var, zl0Var);
            return;
        }
        k7 k7Var = v7Var.E;
        if (k7Var != null) {
            k7Var.f(o7Var.f39120c, o7Var.d, false);
        }
    }
}
