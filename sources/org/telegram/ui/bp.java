package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.d90 {
    public final Context f32421a;
    public final ip f32422b;

    public bp(ip ipVar, Context context) {
        this.f32422b = ipVar;
        this.f32421a = context;
    }

    @Override
    public final void e() {
        this.f32422b.X(true);
    }

    @Override
    public final void j() {
        ip ipVar = this.f32422b;
        org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(this.f32421a, ipVar.f34585l0, ipVar.Y, ipVar.f34588o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f32422b;
        ipVar2.f34589p0 = a70Var;
        ipVar2.f34589p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
