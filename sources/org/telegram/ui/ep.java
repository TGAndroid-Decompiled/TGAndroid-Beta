package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ep implements org.telegram.ui.Components.aa0 {
    public final Context f37516a;
    public final lp f37517b;

    public ep(lp lpVar, Context context) {
        this.f37517b = lpVar;
        this.f37516a = context;
    }

    @Override
    public final void c() {
        this.f37517b.X(true);
    }

    @Override
    public final void i() {
        lp lpVar = this.f37517b;
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(this.f37516a, lpVar.f39813l0, lpVar.Y, lpVar.f39816o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.f37517b;
        lpVar2.f39817p0 = w70Var;
        lpVar2.f39817p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
