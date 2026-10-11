package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.x90 {
    public final Context f36424a;
    public final ip f36425b;

    public bp(ip ipVar, Context context) {
        this.f36425b = ipVar;
        this.f36424a = context;
    }

    @Override
    public final void c() {
        this.f36425b.X(true);
    }

    @Override
    public final void i() {
        ip ipVar = this.f36425b;
        org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(this.f36424a, ipVar.f38751l0, ipVar.Y, ipVar.f38754o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f36425b;
        ipVar2.f38755p0 = u70Var;
        ipVar2.f38755p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
