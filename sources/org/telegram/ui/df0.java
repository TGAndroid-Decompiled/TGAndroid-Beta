package org.telegram.ui;

import android.content.Context;
public final class df0 implements org.telegram.ui.Components.f80 {
    public final org.telegram.ui.Components.g80 f46964a;
    public final ef0 f46965b;

    public df0(ef0 ef0Var, org.telegram.ui.Components.g80 g80Var) {
        this.f46965b = ef0Var;
        this.f46964a = g80Var;
    }

    @Override
    public final void e() {
        ff0.b0(this.f46965b.d);
    }

    @Override
    public final void f() {
        ef0 ef0Var = this.f46965b;
        ff0 ff0Var = ef0Var.d;
        Context context = this.f46964a.getContext();
        ff0 ff0Var2 = ef0Var.d;
        ff0Var.m0 = new org.telegram.ui.Components.a60(context, ff0Var2.f47696e, ff0Var2.d, ff0Var2.f47705l0, ff0Var2, ff0Var2.f47706n, true, ff0Var2.h);
        ef0Var.d.m0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
