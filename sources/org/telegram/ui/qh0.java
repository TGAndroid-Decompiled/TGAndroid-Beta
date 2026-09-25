package org.telegram.ui;

import android.content.Context;
public final class qh0 implements org.telegram.ui.Components.f90 {
    public final org.telegram.ui.Components.g90 f36923a;
    public final rh0 f36924b;

    public qh0(rh0 rh0Var, org.telegram.ui.Components.g90 g90Var) {
        this.f36924b = rh0Var;
        this.f36923a = g90Var;
    }

    @Override
    public final void e() {
        sh0.W(this.f36924b.d);
    }

    @Override
    public final void j() {
        rh0 rh0Var = this.f36924b;
        sh0 sh0Var = rh0Var.d;
        Context context = this.f36923a.getContext();
        sh0 sh0Var2 = rh0Var.d;
        sh0Var.f37784l0 = new org.telegram.ui.Components.c70(context, sh0Var2.e, sh0Var2.d, sh0Var2.f37783k0, sh0Var2, sh0Var2.f37785n, true, sh0Var2.h);
        rh0Var.d.f37784l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
