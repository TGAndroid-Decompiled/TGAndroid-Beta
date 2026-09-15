package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class dp implements org.telegram.ui.Components.u80 {
    public final Context f33096a;
    public final kp f33097b;

    public dp(kp kpVar, Context context) {
        this.f33097b = kpVar;
        this.f33096a = context;
    }

    @Override
    public final void c() {
        this.f33097b.X(true);
    }

    @Override
    public final void i() {
        kp kpVar = this.f33097b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f33096a, kpVar.f35225l0, kpVar.Y, kpVar.f35228o0, kpVar, kpVar.Z, true, ChatObject.isChannel(kpVar.X));
        kp kpVar2 = this.f33097b;
        kpVar2.f35229p0 = r60Var;
        kpVar2.f35229p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
