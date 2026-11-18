package org.telegram.ui;

import android.content.Context;
public final class bo implements org.telegram.ui.Components.d80 {
    public final Context f46270a;
    public final jo f46271b;

    public bo(jo joVar, Context context) {
        this.f46271b = joVar;
        this.f46270a = context;
    }

    @Override
    public final void e() {
        this.f46271b.d0(true);
    }

    @Override
    public final void f() {
        jo joVar = this.f46271b;
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(this.f46270a, joVar.m0, joVar.Z, joVar.f49038p0, joVar, joVar.f49019a0, true, org.telegram.messenger.v3.T(joVar.Y));
        jo joVar2 = this.f46271b;
        joVar2.f49039q0 = x50Var;
        joVar2.f49039q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i() {
    }
}
