package org.telegram.ui;

import android.content.Context;
public final class af0 implements org.telegram.ui.Components.s70 {
    public final org.telegram.ui.Components.t70 f45040a;
    public final bf0 f45041b;

    public af0(bf0 bf0Var, org.telegram.ui.Components.t70 t70Var) {
        this.f45041b = bf0Var;
        this.f45040a = t70Var;
    }

    @Override
    public final void e() {
        cf0.b0(this.f45041b.d);
    }

    @Override
    public final void f() {
        bf0 bf0Var = this.f45041b;
        cf0 cf0Var = bf0Var.d;
        Context context = this.f45040a.getContext();
        cf0 cf0Var2 = bf0Var.d;
        cf0Var.m0 = new org.telegram.ui.Components.p50(context, cf0Var2.f46131e, cf0Var2.d, cf0Var2.f46140l0, cf0Var2, cf0Var2.f46141n, true, cf0Var2.h);
        bf0Var.d.m0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void j() {
    }
}
