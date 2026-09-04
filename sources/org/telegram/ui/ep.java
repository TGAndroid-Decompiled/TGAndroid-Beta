package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ep implements org.telegram.ui.Components.v80 {
    public final Context f36135a;
    public final lp f36136b;

    public ep(lp lpVar, Context context) {
        this.f36136b = lpVar;
        this.f36135a = context;
    }

    @Override
    public final void c() {
        this.f36136b.X(true);
    }

    @Override
    public final void d() {
        lp lpVar = this.f36136b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f36135a, lpVar.f38439l0, lpVar.Y, lpVar.f38442o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.f36136b;
        lpVar2.f38443p0 = r60Var;
        lpVar2.f38443p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }
}
