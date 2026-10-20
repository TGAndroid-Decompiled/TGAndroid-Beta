package org.telegram.ui;

import android.view.View;
public final class g7 implements org.telegram.ui.Components.xl0 {
    public final org.telegram.ui.Components.jm0 f37207a;
    public final h7 f37208b;

    public g7(h7 h7Var, org.telegram.ui.Components.jm0 jm0Var) {
        this.f37208b = h7Var;
        this.f37207a = jm0Var;
    }

    @Override
    public final void a(int i10, View view) {
        v7 v7Var = this.f37208b.d;
        org.telegram.ui.Components.jm0 jm0Var = this.f37207a;
        i7 i7Var = (i7) jm0Var.getAdapter();
        p7 p7Var = (p7) i7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            v7.a(v7Var, p7Var, (r7) i7Var, jm0Var);
            return;
        }
        l7 l7Var = v7Var.v;
        if (l7Var != null) {
            l7Var.s0(p7Var.f40082c, p7Var.d, false);
        }
    }
}
