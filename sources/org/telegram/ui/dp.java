package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class dp implements org.telegram.ui.Components.u80 {
    public final Context f33192a;
    public final kp f33193b;

    public dp(kp kpVar, Context context) {
        this.f33193b = kpVar;
        this.f33192a = context;
    }

    @Override
    public final void c() {
        this.f33193b.X(true);
    }

    @Override
    public final void i() {
        kp kpVar = this.f33193b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f33192a, kpVar.f35332l0, kpVar.Y, kpVar.f35335o0, kpVar, kpVar.Z, true, ChatObject.isChannel(kpVar.X));
        kp kpVar2 = this.f33193b;
        kpVar2.f35336p0 = r60Var;
        kpVar2.f35336p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
