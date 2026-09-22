package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.f90 {
    public final Context f32524a;
    public final ip f32525b;

    public bp(ip ipVar, Context context) {
        this.f32525b = ipVar;
        this.f32524a = context;
    }

    @Override
    public final void c() {
        this.f32525b.X(true);
    }

    @Override
    public final void h() {
        ip ipVar = this.f32525b;
        org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(this.f32524a, ipVar.f34669l0, ipVar.Y, ipVar.f34672o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f32525b;
        ipVar2.f34673p0 = c70Var;
        ipVar2.f34673p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void i() {
    }
}
