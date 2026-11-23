package org.telegram.ui;

import android.content.Context;
public final class ao implements org.telegram.ui.Components.f80 {
    public final Context f45619a;
    public final io f45620b;

    public ao(io ioVar, Context context) {
        this.f45620b = ioVar;
        this.f45619a = context;
    }

    @Override
    public final void e() {
        this.f45620b.d0(true);
    }

    @Override
    public final void f() {
        io ioVar = this.f45620b;
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(this.f45619a, ioVar.m0, ioVar.Z, ioVar.f48797p0, ioVar, ioVar.f48778a0, true, org.telegram.messenger.v3.T(ioVar.Y));
        io ioVar2 = this.f45620b;
        ioVar2.f48798q0 = a60Var;
        ioVar2.f48798q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
