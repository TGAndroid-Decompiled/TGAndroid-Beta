package org.telegram.ui;

import android.content.Context;
public final class ef0 implements org.telegram.ui.Components.d80 {
    public final org.telegram.ui.Components.e80 f47216a;
    public final ff0 f47217b;

    public ef0(ff0 ff0Var, org.telegram.ui.Components.e80 e80Var) {
        this.f47217b = ff0Var;
        this.f47216a = e80Var;
    }

    @Override
    public final void e() {
        gf0.b0(this.f47217b.d);
    }

    @Override
    public final void f() {
        ff0 ff0Var = this.f47217b;
        gf0 gf0Var = ff0Var.d;
        Context context = this.f47216a.getContext();
        gf0 gf0Var2 = ff0Var.d;
        gf0Var.m0 = new org.telegram.ui.Components.x50(context, gf0Var2.f48005e, gf0Var2.d, gf0Var2.f48014l0, gf0Var2, gf0Var2.f48015n, true, gf0Var2.h);
        ff0Var.d.m0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
