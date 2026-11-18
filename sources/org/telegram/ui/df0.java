package org.telegram.ui;

import android.content.Context;
public final class df0 implements org.telegram.ui.Components.d80 {
    public final org.telegram.ui.Components.e80 f46971a;
    public final ef0 f46972b;

    public df0(ef0 ef0Var, org.telegram.ui.Components.e80 e80Var) {
        this.f46972b = ef0Var;
        this.f46971a = e80Var;
    }

    @Override
    public final void e() {
        ff0.b0(this.f46972b.d);
    }

    @Override
    public final void f() {
        ef0 ef0Var = this.f46972b;
        ff0 ff0Var = ef0Var.d;
        Context context = this.f46971a.getContext();
        ff0 ff0Var2 = ef0Var.d;
        ff0Var.m0 = new org.telegram.ui.Components.x50(context, ff0Var2.f47671e, ff0Var2.d, ff0Var2.f47680l0, ff0Var2, ff0Var2.f47681n, true, ff0Var2.h);
        ef0Var.d.m0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
