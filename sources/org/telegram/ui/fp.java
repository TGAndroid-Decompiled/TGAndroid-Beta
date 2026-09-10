package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class fp implements org.telegram.ui.Components.e90 {
    public final Context f32873a;
    public final mp f32874b;

    public fp(mp mpVar, Context context) {
        this.f32874b = mpVar;
        this.f32873a = context;
    }

    @Override
    public final void e() {
        this.f32874b.X(true);
    }

    @Override
    public final void i() {
        mp mpVar = this.f32874b;
        org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(this.f32873a, mpVar.f35030l0, mpVar.Y, mpVar.f35033o0, mpVar, mpVar.Z, true, ChatObject.isChannel(mpVar.X));
        mp mpVar2 = this.f32874b;
        mpVar2.f35034p0 = a70Var;
        mpVar2.f35034p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void j() {
    }
}
