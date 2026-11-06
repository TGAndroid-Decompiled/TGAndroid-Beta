package org.telegram.ui;

import android.content.Context;
public final class af0 implements org.telegram.ui.Components.p70 {
    public final org.telegram.ui.Components.q70 f43636a;
    public final bf0 f43637b;

    public af0(bf0 bf0Var, org.telegram.ui.Components.q70 q70Var) {
        this.f43637b = bf0Var;
        this.f43636a = q70Var;
    }

    @Override
    public final void e() {
        cf0.b0(this.f43637b.d);
    }

    @Override
    public final void f() {
        bf0 bf0Var = this.f43637b;
        cf0 cf0Var = bf0Var.d;
        Context context = this.f43636a.getContext();
        cf0 cf0Var2 = bf0Var.d;
        cf0Var.f44808l0 = new org.telegram.ui.Components.m50(context, cf0Var2.f44799e, cf0Var2.d, cf0Var2.f44807k0, cf0Var2, cf0Var2.f44809n, true, cf0Var2.h);
        bf0Var.d.f44808l0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
