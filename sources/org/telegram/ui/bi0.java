package org.telegram.ui;

import android.content.Context;
public final class bi0 implements org.telegram.ui.Components.v90 {
    public final org.telegram.ui.Components.w90 f34336a;
    public final ci0 f34337b;

    public bi0(ci0 ci0Var, org.telegram.ui.Components.w90 w90Var) {
        this.f34337b = ci0Var;
        this.f34336a = w90Var;
    }

    @Override
    public final void d() {
        di0.W(this.f34337b.d);
    }

    @Override
    public final void i() {
        ci0 ci0Var = this.f34337b;
        di0 di0Var = ci0Var.d;
        Context context = this.f34336a.getContext();
        di0 di0Var2 = ci0Var.d;
        di0Var.f35045l0 = new org.telegram.ui.Components.p70(context, di0Var2.e, di0Var2.d, di0Var2.f35044k0, di0Var2, di0Var2.f35046n, true, di0Var2.h);
        ci0Var.d.f35045l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void j() {
    }
}
