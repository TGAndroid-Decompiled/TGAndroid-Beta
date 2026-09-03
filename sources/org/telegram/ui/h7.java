package org.telegram.ui;

import android.view.View;
public final class h7 implements org.telegram.ui.Components.hl0 {
    public final org.telegram.ui.Components.rl0 f34588a;
    public final i7 f34589b;

    public h7(i7 i7Var, org.telegram.ui.Components.rl0 rl0Var) {
        this.f34589b = i7Var;
        this.f34588a = rl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        w7 w7Var = this.f34589b.d;
        org.telegram.ui.Components.rl0 rl0Var = this.f34588a;
        j7 j7Var = (j7) rl0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.q7) {
            w7.a(w7Var, q7Var, (s7) j7Var, rl0Var);
            return;
        }
        m7 m7Var = w7Var.v;
        if (m7Var != null) {
            m7Var.r(q7Var.f37321c, q7Var.d, false);
        }
    }
}
