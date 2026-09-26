package org.telegram.ui;

import android.content.Context;
public final class qh0 implements org.telegram.ui.Components.f90 {
    public final org.telegram.ui.Components.g90 f36922a;
    public final rh0 f36923b;

    public qh0(rh0 rh0Var, org.telegram.ui.Components.g90 g90Var) {
        this.f36923b = rh0Var;
        this.f36922a = g90Var;
    }

    @Override
    public final void e() {
        sh0.W(this.f36923b.d);
    }

    @Override
    public final void j() {
        rh0 rh0Var = this.f36923b;
        sh0 sh0Var = rh0Var.d;
        Context context = this.f36922a.getContext();
        sh0 sh0Var2 = rh0Var.d;
        sh0Var.f37783l0 = new org.telegram.ui.Components.c70(context, sh0Var2.e, sh0Var2.d, sh0Var2.f37782k0, sh0Var2, sh0Var2.f37784n, true, sh0Var2.h);
        rh0Var.d.f37783l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
