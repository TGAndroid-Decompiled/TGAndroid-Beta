package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.x90 {
    public final Context f36408a;
    public final ip f36409b;

    public bp(ip ipVar, Context context) {
        this.f36409b = ipVar;
        this.f36408a = context;
    }

    @Override
    public final void c() {
        this.f36409b.X(true);
    }

    @Override
    public final void i() {
        ip ipVar = this.f36409b;
        org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(this.f36408a, ipVar.f38768l0, ipVar.Y, ipVar.f38771o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f36409b;
        ipVar2.f38772p0 = u70Var;
        ipVar2.f38772p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
