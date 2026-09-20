package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class bp implements org.telegram.ui.Components.c90 {
    public final Context f32504a;
    public final ip f32505b;

    public bp(ip ipVar, Context context) {
        this.f32505b = ipVar;
        this.f32504a = context;
    }

    @Override
    public final void e() {
        this.f32505b.X(true);
    }

    @Override
    public final void h() {
        ip ipVar = this.f32505b;
        org.telegram.ui.Components.z60 z60Var = new org.telegram.ui.Components.z60(this.f32504a, ipVar.f34644l0, ipVar.Y, ipVar.f34647o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.f32505b;
        ipVar2.f34648p0 = z60Var;
        ipVar2.f34648p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i() {
    }
}
