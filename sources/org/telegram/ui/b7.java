package org.telegram.ui;

import android.view.View;
public final class b7 implements org.telegram.ui.Components.gm0 {
    public final org.telegram.ui.Components.sm0 f36287a;
    public final c7 f36288b;

    public b7(c7 c7Var, org.telegram.ui.Components.sm0 sm0Var) {
        this.f36288b = c7Var;
        this.f36287a = sm0Var;
    }

    @Override
    public final void d(int i10, View view) {
        q7 q7Var = this.f36288b.d;
        org.telegram.ui.Components.sm0 sm0Var = this.f36287a;
        d7 d7Var = (d7) sm0Var.getAdapter();
        k7 k7Var = (k7) d7Var.f36928e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            q7.a(q7Var, k7Var, (m7) d7Var, sm0Var);
            return;
        }
        g7 g7Var = q7Var.v;
        if (g7Var != null) {
            g7Var.y0(k7Var.f39216c, k7Var.d, false);
        }
    }
}
