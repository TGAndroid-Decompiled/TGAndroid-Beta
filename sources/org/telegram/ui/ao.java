package org.telegram.ui;

import android.content.Context;
public final class ao implements org.telegram.ui.Components.q70 {
    public final Context f43750a;
    public final io f43751b;

    public ao(io ioVar, Context context) {
        this.f43751b = ioVar;
        this.f43750a = context;
    }

    @Override
    public final void e() {
        this.f43751b.d0(true);
    }

    @Override
    public final void f() {
        io ioVar = this.f43751b;
        org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(this.f43750a, ioVar.f46724l0, ioVar.Y, ioVar.f46727o0, ioVar, ioVar.Z, true, org.telegram.messenger.t3.T(ioVar.X));
        io ioVar2 = this.f43751b;
        ioVar2.f46728p0 = n50Var;
        ioVar2.f46728p0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
