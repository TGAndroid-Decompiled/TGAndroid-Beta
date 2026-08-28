package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.mk0 {
    public final org.telegram.ui.Components.wk0 f37078a;
    public final d7 f37079b;

    public c7(d7 d7Var, org.telegram.ui.Components.wk0 wk0Var) {
        this.f37079b = d7Var;
        this.f37078a = wk0Var;
    }

    @Override
    public final void a(int i9, View view) {
        r7 r7Var = this.f37079b.d;
        org.telegram.ui.Components.wk0 wk0Var = this.f37078a;
        e7 e7Var = (e7) wk0Var.getAdapter();
        l7 l7Var = (l7) e7Var.f37834e.get(i9);
        if (view instanceof org.telegram.ui.Cells.r7) {
            r7.a(r7Var, l7Var, (n7) e7Var, wk0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.o1(l7Var.f40070c, l7Var.d, false);
        }
    }
}
