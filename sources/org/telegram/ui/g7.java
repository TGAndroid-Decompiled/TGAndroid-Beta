package org.telegram.ui;

import android.view.View;
public final class g7 implements org.telegram.ui.Components.am0 {
    public final org.telegram.ui.Components.mm0 f37506a;
    public final h7 f37507b;

    public g7(h7 h7Var, org.telegram.ui.Components.mm0 mm0Var) {
        this.f37507b = h7Var;
        this.f37506a = mm0Var;
    }

    @Override
    public final void d(int i10, View view) {
        v7 v7Var = this.f37507b.d;
        org.telegram.ui.Components.mm0 mm0Var = this.f37506a;
        i7 i7Var = (i7) mm0Var.getAdapter();
        p7 p7Var = (p7) i7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            v7.a(v7Var, p7Var, (r7) i7Var, mm0Var);
            return;
        }
        l7 l7Var = v7Var.f42629w;
        if (l7Var != null) {
            l7Var.s0(p7Var.f40387c, p7Var.d, false);
        }
    }
}
