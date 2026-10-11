package org.telegram.ui;

import android.view.View;
public final class b7 implements org.telegram.ui.Components.fm0 {
    public final org.telegram.ui.Components.rm0 f36321a;
    public final c7 f36322b;

    public b7(c7 c7Var, org.telegram.ui.Components.rm0 rm0Var) {
        this.f36322b = c7Var;
        this.f36321a = rm0Var;
    }

    @Override
    public final void d(int i10, View view) {
        q7 q7Var = this.f36322b.d;
        org.telegram.ui.Components.rm0 rm0Var = this.f36321a;
        d7 d7Var = (d7) rm0Var.getAdapter();
        k7 k7Var = (k7) d7Var.f36962e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            q7.a(q7Var, k7Var, (m7) d7Var, rm0Var);
            return;
        }
        g7 g7Var = q7Var.v;
        if (g7Var != null) {
            g7Var.y0(k7Var.f39250c, k7Var.d, false);
        }
    }
}
