package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.w90 {
    public final Context f36458a;
    public final ip f36459b;

    public bp(ip ipVar, Context context) {
        this.f36459b = ipVar;
        this.f36458a = context;
    }

    @Override
    public final void c() {
        this.f36459b.X(true);
    }

    @Override
    public final void i() {
        ip ipVar = this.f36459b;
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(this.f36458a, ipVar.f38785l0, ipVar.Y, ipVar.f38788o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f36459b;
        ipVar2.f38789p0 = t70Var;
        ipVar2.f38789p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
