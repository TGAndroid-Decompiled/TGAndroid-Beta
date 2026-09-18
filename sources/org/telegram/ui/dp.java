package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class dp implements org.telegram.ui.Components.u80 {
    public final Context f33196a;
    public final kp f33197b;

    public dp(kp kpVar, Context context) {
        this.f33197b = kpVar;
        this.f33196a = context;
    }

    @Override
    public final void c() {
        this.f33197b.X(true);
    }

    @Override
    public final void i() {
        kp kpVar = this.f33197b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f33196a, kpVar.f35337l0, kpVar.Y, kpVar.f35340o0, kpVar, kpVar.Z, true, ChatObject.isChannel(kpVar.X));
        kp kpVar2 = this.f33197b;
        kpVar2.f35341p0 = r60Var;
        kpVar2.f35341p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
