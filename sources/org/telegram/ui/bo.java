package org.telegram.ui;

import android.content.Context;
public final class bo implements org.telegram.ui.Components.f80 {
    public final Context f46284a;
    public final jo f46285b;

    public bo(jo joVar, Context context) {
        this.f46285b = joVar;
        this.f46284a = context;
    }

    @Override
    public final void e() {
        this.f46285b.d0(true);
    }

    @Override
    public final void f() {
        jo joVar = this.f46285b;
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(this.f46284a, joVar.m0, joVar.Z, joVar.f49048p0, joVar, joVar.f49029a0, true, org.telegram.messenger.v3.T(joVar.Y));
        jo joVar2 = this.f46285b;
        joVar2.f49049q0 = a60Var;
        joVar2.f49049q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
