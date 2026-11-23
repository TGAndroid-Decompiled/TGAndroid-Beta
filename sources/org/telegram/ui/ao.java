package org.telegram.ui;

import android.content.Context;
public final class ao implements org.telegram.ui.Components.c80 {
    public final Context f45778a;
    public final io f45779b;

    public ao(io ioVar, Context context) {
        this.f45779b = ioVar;
        this.f45778a = context;
    }

    @Override
    public final void e() {
        this.f45779b.d0(true);
    }

    @Override
    public final void g() {
        io ioVar = this.f45779b;
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(this.f45778a, ioVar.m0, ioVar.Z, ioVar.f48881p0, ioVar, ioVar.f48862a0, true, org.telegram.messenger.v3.T(ioVar.Y));
        io ioVar2 = this.f45779b;
        ioVar2.f48882q0 = x50Var;
        ioVar2.f48882q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void j() {
    }
}
