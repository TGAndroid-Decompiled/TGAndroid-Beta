package org.telegram.ui;

import android.content.Context;
public final class af0 implements org.telegram.ui.Components.p70 {
    public final org.telegram.ui.Components.q70 f43642a;
    public final bf0 f43643b;

    public af0(bf0 bf0Var, org.telegram.ui.Components.q70 q70Var) {
        this.f43643b = bf0Var;
        this.f43642a = q70Var;
    }

    @Override
    public final void e() {
        cf0.b0(this.f43643b.d);
    }

    @Override
    public final void f() {
        bf0 bf0Var = this.f43643b;
        cf0 cf0Var = bf0Var.d;
        Context context = this.f43642a.getContext();
        cf0 cf0Var2 = bf0Var.d;
        cf0Var.f44813l0 = new org.telegram.ui.Components.m50(context, cf0Var2.f44804e, cf0Var2.d, cf0Var2.f44812k0, cf0Var2, cf0Var2.f44814n, true, cf0Var2.h);
        bf0Var.d.f44813l0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
