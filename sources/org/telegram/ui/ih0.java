package org.telegram.ui;

import android.content.Context;
public final class ih0 implements org.telegram.ui.Components.p90 {
    public final org.telegram.ui.Components.q90 f37895a;
    public final jh0 f37896b;

    public ih0(jh0 jh0Var, org.telegram.ui.Components.q90 q90Var) {
        this.f37896b = jh0Var;
        this.f37895a = q90Var;
    }

    @Override
    public final void d() {
        kh0.W(this.f37896b.d);
    }

    @Override
    public final void i() {
        jh0 jh0Var = this.f37896b;
        kh0 kh0Var = jh0Var.d;
        Context context = this.f37895a.getContext();
        kh0 kh0Var2 = jh0Var.d;
        kh0Var.f38541l0 = new org.telegram.ui.Components.l70(context, kh0Var2.e, kh0Var2.d, kh0Var2.f38540k0, kh0Var2, kh0Var2.f38542n, true, kh0Var2.h);
        jh0Var.d.f38541l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
