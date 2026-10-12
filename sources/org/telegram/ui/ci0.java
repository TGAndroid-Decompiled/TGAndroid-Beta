package org.telegram.ui;

import android.content.Context;
public final class ci0 implements org.telegram.ui.Components.v90 {
    public final org.telegram.ui.Components.w90 f34956a;
    public final di0 f34957b;

    public ci0(di0 di0Var, org.telegram.ui.Components.w90 w90Var) {
        this.f34957b = di0Var;
        this.f34956a = w90Var;
    }

    @Override
    public final void d() {
        ei0.W(this.f34957b.d);
    }

    @Override
    public final void h() {
        di0 di0Var = this.f34957b;
        ei0 ei0Var = di0Var.d;
        Context context = this.f34956a.getContext();
        ei0 ei0Var2 = di0Var.d;
        ei0Var.f35599l0 = new org.telegram.ui.Components.p70(context, ei0Var2.e, ei0Var2.d, ei0Var2.f35598k0, ei0Var2, ei0Var2.f35600n, true, ei0Var2.h);
        di0Var.d.f35599l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i() {
    }
}
