package org.telegram.ui;

import android.view.View;
public final class g7 implements org.telegram.ui.Components.am0 {
    public final org.telegram.ui.Components.nm0 f39518a;
    public final h7 f39519b;

    public g7(h7 h7Var, org.telegram.ui.Components.nm0 nm0Var) {
        this.f39519b = h7Var;
        this.f39518a = nm0Var;
    }

    @Override
    public final void c(int i10, View view) {
        x7 x7Var = this.f39519b.f39802f;
        org.telegram.ui.Components.nm0 nm0Var = this.f39518a;
        j7 j7Var = (j7) nm0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.w7) {
            x7.a(x7Var, q7Var, (s7) j7Var, nm0Var);
            return;
        }
        m7 m7Var = x7Var.F;
        if (m7Var != null) {
            m7Var.q(q7Var.f42625c, q7Var.d, false);
        }
    }
}
