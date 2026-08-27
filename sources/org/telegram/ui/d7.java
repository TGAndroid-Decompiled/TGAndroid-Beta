package org.telegram.ui;

import android.view.View;

public final class d7 implements org.telegram.ui.Components.pk0 {

    public final org.telegram.ui.Components.zk0 f37282a;

    public final e7 f37283b;

    public d7(e7 e7Var, org.telegram.ui.Components.zk0 zk0Var) {
        this.f37283b = e7Var;
        this.f37282a = zk0Var;
    }

    @Override
    public final void a(int i10, View view) {
        s7 s7Var = this.f37283b.d;
        org.telegram.ui.Components.zk0 zk0Var = this.f37282a;
        f7 f7Var = (f7) zk0Var.getAdapter();
        m7 m7Var = (m7) f7Var.f37950e.get(i10);
        if (view instanceof org.telegram.ui.Cells.o7) {
            s7.a(s7Var, m7Var, (o7) f7Var, zk0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.J(m7Var.f40384c, m7Var.d, false);
        }
    }
}
