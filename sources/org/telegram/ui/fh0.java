package org.telegram.ui;

import android.content.Context;
public final class fh0 implements org.telegram.ui.Components.p90 {
    public final org.telegram.ui.Components.q90 f37011a;
    public final gh0 f37012b;

    public fh0(gh0 gh0Var, org.telegram.ui.Components.q90 q90Var) {
        this.f37012b = gh0Var;
        this.f37011a = q90Var;
    }

    @Override
    public final void d() {
        hh0.W(this.f37012b.d);
    }

    @Override
    public final void i() {
        gh0 gh0Var = this.f37012b;
        hh0 hh0Var = gh0Var.d;
        Context context = this.f37011a.getContext();
        hh0 hh0Var2 = gh0Var.d;
        hh0Var.f37637l0 = new org.telegram.ui.Components.l70(context, hh0Var2.e, hh0Var2.d, hh0Var2.f37636k0, hh0Var2, hh0Var2.f37638n, true, hh0Var2.h);
        gh0Var.d.f37637l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
