package org.telegram.ui;

import android.content.Context;
public final class ao implements org.telegram.ui.Components.p70 {
    public final Context f43782a;
    public final io f43783b;

    public ao(io ioVar, Context context) {
        this.f43783b = ioVar;
        this.f43782a = context;
    }

    @Override
    public final void e() {
        this.f43783b.d0(true);
    }

    @Override
    public final void f() {
        io ioVar = this.f43783b;
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(this.f43782a, ioVar.f46697l0, ioVar.Y, ioVar.f46700o0, ioVar, ioVar.Z, true, org.telegram.messenger.t3.T(ioVar.X));
        io ioVar2 = this.f43783b;
        ioVar2.f46701p0 = m50Var;
        ioVar2.f46701p0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
