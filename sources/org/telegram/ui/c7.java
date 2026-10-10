package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.fm0 {
    public final org.telegram.ui.Components.rm0 f36584a;
    public final d7 f36585b;

    public c7(d7 d7Var, org.telegram.ui.Components.rm0 rm0Var) {
        this.f36585b = d7Var;
        this.f36584a = rm0Var;
    }

    @Override
    public final void d(int i10, View view) {
        r7 r7Var = this.f36585b.d;
        org.telegram.ui.Components.rm0 rm0Var = this.f36584a;
        e7 e7Var = (e7) rm0Var.getAdapter();
        l7 l7Var = (l7) e7Var.f37219e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            r7.a(r7Var, l7Var, (n7) e7Var, rm0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.y0(l7Var.f39492c, l7Var.d, false);
        }
    }
}
