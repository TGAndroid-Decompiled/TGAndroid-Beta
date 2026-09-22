package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class dp implements org.telegram.ui.Components.u80 {
    public final Context f33057a;
    public final kp f33058b;

    public dp(kp kpVar, Context context) {
        this.f33058b = kpVar;
        this.f33057a = context;
    }

    @Override
    public final void c() {
        this.f33058b.X(true);
    }

    @Override
    public final void i() {
        kp kpVar = this.f33058b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f33057a, kpVar.f35218l0, kpVar.Y, kpVar.f35221o0, kpVar, kpVar.Z, true, ChatObject.isChannel(kpVar.X));
        kp kpVar2 = this.f33058b;
        kpVar2.f35222p0 = r60Var;
        kpVar2.f35222p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
