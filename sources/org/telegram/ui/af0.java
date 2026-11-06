package org.telegram.ui;

import android.content.Context;
public final class af0 implements org.telegram.ui.Components.p70 {
    public final org.telegram.ui.Components.q70 f43612a;
    public final bf0 f43613b;

    public af0(bf0 bf0Var, org.telegram.ui.Components.q70 q70Var) {
        this.f43613b = bf0Var;
        this.f43612a = q70Var;
    }

    @Override
    public final void e() {
        cf0.b0(this.f43613b.d);
    }

    @Override
    public final void f() {
        bf0 bf0Var = this.f43613b;
        cf0 cf0Var = bf0Var.d;
        Context context = this.f43612a.getContext();
        cf0 cf0Var2 = bf0Var.d;
        cf0Var.f44788l0 = new org.telegram.ui.Components.m50(context, cf0Var2.f44779e, cf0Var2.d, cf0Var2.f44787k0, cf0Var2, cf0Var2.f44789n, true, cf0Var2.h);
        bf0Var.d.f44788l0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
