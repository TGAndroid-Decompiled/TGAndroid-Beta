package org.telegram.ui;

import android.content.Context;
public final class bo implements org.telegram.ui.Components.d80 {
    public final Context f46261a;
    public final jo f46262b;

    public bo(jo joVar, Context context) {
        this.f46262b = joVar;
        this.f46261a = context;
    }

    @Override
    public final void e() {
        this.f46262b.d0(true);
    }

    @Override
    public final void f() {
        jo joVar = this.f46262b;
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(this.f46261a, joVar.m0, joVar.Z, joVar.f49015p0, joVar, joVar.f48996a0, true, org.telegram.messenger.v3.T(joVar.Y));
        jo joVar2 = this.f46262b;
        joVar2.f49016q0 = x50Var;
        joVar2.f49016q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
