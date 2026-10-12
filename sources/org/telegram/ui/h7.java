package org.telegram.ui;

import android.view.View;
public final class h7 implements org.telegram.ui.Components.am0 {
    public final org.telegram.ui.Components.mm0 f36631a;
    public final i7 f36632b;

    public h7(i7 i7Var, org.telegram.ui.Components.mm0 mm0Var) {
        this.f36632b = i7Var;
        this.f36631a = mm0Var;
    }

    @Override
    public final void a(int i10, View view) {
        w7 w7Var = this.f36632b.d;
        org.telegram.ui.Components.mm0 mm0Var = this.f36631a;
        j7 j7Var = (j7) mm0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            w7.a(w7Var, q7Var, (s7) j7Var, mm0Var);
            return;
        }
        m7 m7Var = w7Var.v;
        if (m7Var != null) {
            m7Var.j1(q7Var.f39350c, q7Var.d, false);
        }
    }
}
