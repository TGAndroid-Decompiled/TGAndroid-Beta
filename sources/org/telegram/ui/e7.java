package org.telegram.ui;

import android.view.View;
public final class e7 implements org.telegram.ui.Components.al0 {
    public final org.telegram.ui.Components.ml0 f33301a;
    public final f7 f33302b;

    public e7(f7 f7Var, org.telegram.ui.Components.ml0 ml0Var) {
        this.f33302b = f7Var;
        this.f33301a = ml0Var;
    }

    @Override
    public final void d(int i10, View view) {
        u7 u7Var = this.f33302b.e;
        org.telegram.ui.Components.ml0 ml0Var = this.f33301a;
        h7 h7Var = (h7) ml0Var.getAdapter();
        o7 o7Var = (o7) h7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            u7.a(u7Var, o7Var, (q7) h7Var, ml0Var);
            return;
        }
        k7 k7Var = u7Var.E;
        if (k7Var != null) {
            k7Var.H0(o7Var.f36239c, o7Var.d, false);
        }
    }
}
