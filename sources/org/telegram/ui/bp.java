package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.w90 {
    public final Context f36362a;
    public final ip f36363b;

    public bp(ip ipVar, Context context) {
        this.f36363b = ipVar;
        this.f36362a = context;
    }

    @Override
    public final void c() {
        this.f36363b.X(true);
    }

    @Override
    public final void i() {
        ip ipVar = this.f36363b;
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(this.f36362a, ipVar.f38722l0, ipVar.Y, ipVar.f38725o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f36363b;
        ipVar2.f38726p0 = t70Var;
        ipVar2.f38726p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
