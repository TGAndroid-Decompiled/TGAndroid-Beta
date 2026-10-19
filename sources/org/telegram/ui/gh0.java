package org.telegram.ui;

import android.content.Context;
public final class gh0 implements org.telegram.ui.Components.p90 {
    public final org.telegram.ui.Components.q90 f37323a;
    public final hh0 f37324b;

    public gh0(hh0 hh0Var, org.telegram.ui.Components.q90 q90Var) {
        this.f37324b = hh0Var;
        this.f37323a = q90Var;
    }

    @Override
    public final void d() {
        ih0.W(this.f37324b.d);
    }

    @Override
    public final void i() {
        hh0 hh0Var = this.f37324b;
        ih0 ih0Var = hh0Var.d;
        Context context = this.f37323a.getContext();
        ih0 ih0Var2 = hh0Var.d;
        ih0Var.f37985l0 = new org.telegram.ui.Components.l70(context, ih0Var2.e, ih0Var2.d, ih0Var2.f37984k0, ih0Var2, ih0Var2.f37986n, true, ih0Var2.h);
        hh0Var.d.f37985l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
