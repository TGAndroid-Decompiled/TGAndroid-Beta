package org.telegram.ui;

import android.content.Context;
public final class hh0 implements org.telegram.ui.Components.p90 {
    public final org.telegram.ui.Components.q90 f37538a;
    public final ih0 f37539b;

    public hh0(ih0 ih0Var, org.telegram.ui.Components.q90 q90Var) {
        this.f37539b = ih0Var;
        this.f37538a = q90Var;
    }

    @Override
    public final void d() {
        jh0.W(this.f37539b.d);
    }

    @Override
    public final void i() {
        ih0 ih0Var = this.f37539b;
        jh0 jh0Var = ih0Var.d;
        Context context = this.f37538a.getContext();
        jh0 jh0Var2 = ih0Var.d;
        jh0Var.f38157l0 = new org.telegram.ui.Components.l70(context, jh0Var2.e, jh0Var2.d, jh0Var2.f38156k0, jh0Var2, jh0Var2.f38158n, true, jh0Var2.h);
        ih0Var.d.f38157l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
