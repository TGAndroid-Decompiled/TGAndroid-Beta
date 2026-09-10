package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.jl0 {
    public final org.telegram.ui.Components.vl0 f31546a;
    public final d7 f31547b;

    public c7(d7 d7Var, org.telegram.ui.Components.vl0 vl0Var) {
        this.f31547b = d7Var;
        this.f31546a = vl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        r7 r7Var = this.f31547b.d;
        org.telegram.ui.Components.vl0 vl0Var = this.f31546a;
        e7 e7Var = (e7) vl0Var.getAdapter();
        l7 l7Var = (l7) e7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.u7) {
            r7.a(r7Var, l7Var, (n7) e7Var, vl0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.a0(l7Var.f34548c, l7Var.d, false);
        }
    }
}
