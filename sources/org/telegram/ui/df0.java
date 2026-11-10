package org.telegram.ui;

import android.content.Context;
public final class df0 implements org.telegram.ui.Components.p70 {
    public final org.telegram.ui.Components.q70 f44973a;
    public final ef0 f44974b;

    public df0(ef0 ef0Var, org.telegram.ui.Components.q70 q70Var) {
        this.f44974b = ef0Var;
        this.f44973a = q70Var;
    }

    @Override
    public final void e() {
        ff0.b0(this.f44974b.d);
    }

    @Override
    public final void f() {
        ef0 ef0Var = this.f44974b;
        ff0 ff0Var = ef0Var.d;
        Context context = this.f44973a.getContext();
        ff0 ff0Var2 = ef0Var.d;
        ff0Var.f45745l0 = new org.telegram.ui.Components.m50(context, ff0Var2.f45736e, ff0Var2.d, ff0Var2.f45744k0, ff0Var2, ff0Var2.f45746n, true, ff0Var2.h);
        ef0Var.d.f45745l0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
