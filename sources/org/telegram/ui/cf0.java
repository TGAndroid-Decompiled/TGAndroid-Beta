package org.telegram.ui;

import android.content.Context;
public final class cf0 implements org.telegram.ui.Components.c80 {
    public final org.telegram.ui.Components.d80 f46790a;
    public final df0 f46791b;

    public cf0(df0 df0Var, org.telegram.ui.Components.d80 d80Var) {
        this.f46791b = df0Var;
        this.f46790a = d80Var;
    }

    @Override
    public final void e() {
        ef0.b0(this.f46791b.d);
    }

    @Override
    public final void g() {
        df0 df0Var = this.f46791b;
        ef0 ef0Var = df0Var.d;
        Context context = this.f46790a.getContext();
        ef0 ef0Var2 = df0Var.d;
        ef0Var.m0 = new org.telegram.ui.Components.x50(context, ef0Var2.f47523e, ef0Var2.d, ef0Var2.f47532l0, ef0Var2, ef0Var2.f47533n, true, ef0Var2.h);
        df0Var.d.m0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void j() {
    }
}
