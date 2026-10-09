package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.em0 {
    public final org.telegram.ui.Components.qm0 f36538a;
    public final d7 f36539b;

    public c7(d7 d7Var, org.telegram.ui.Components.qm0 qm0Var) {
        this.f36539b = d7Var;
        this.f36538a = qm0Var;
    }

    @Override
    public final void d(int i10, View view) {
        r7 r7Var = this.f36539b.d;
        org.telegram.ui.Components.qm0 qm0Var = this.f36538a;
        e7 e7Var = (e7) qm0Var.getAdapter();
        l7 l7Var = (l7) e7Var.f37173e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            r7.a(r7Var, l7Var, (n7) e7Var, qm0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.y0(l7Var.f39446c, l7Var.d, false);
        }
    }
}
