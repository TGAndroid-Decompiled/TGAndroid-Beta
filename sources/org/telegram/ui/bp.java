package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.w90 {
    public final Context f36364a;
    public final ip f36365b;

    public bp(ip ipVar, Context context) {
        this.f36365b = ipVar;
        this.f36364a = context;
    }

    @Override
    public final void c() {
        this.f36365b.X(true);
    }

    @Override
    public final void i() {
        ip ipVar = this.f36365b;
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(this.f36364a, ipVar.f38724l0, ipVar.Y, ipVar.f38727o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f36365b;
        ipVar2.f38728p0 = t70Var;
        ipVar2.f38728p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
