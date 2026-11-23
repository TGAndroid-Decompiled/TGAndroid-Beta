package org.telegram.ui;

import android.content.Context;
public final class bo implements org.telegram.ui.Components.f80 {
    public final Context f46288a;
    public final jo f46289b;

    public bo(jo joVar, Context context) {
        this.f46289b = joVar;
        this.f46288a = context;
    }

    @Override
    public final void e() {
        this.f46289b.d0(true);
    }

    @Override
    public final void f() {
        jo joVar = this.f46289b;
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(this.f46288a, joVar.m0, joVar.Z, joVar.f49052p0, joVar, joVar.f49033a0, true, org.telegram.messenger.v3.T(joVar.Y));
        jo joVar2 = this.f46289b;
        joVar2.f49053q0 = a60Var;
        joVar2.f49053q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
