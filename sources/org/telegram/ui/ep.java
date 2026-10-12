package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ep implements org.telegram.ui.Components.aa0 {
    public final Context f37521a;
    public final lp f37522b;

    public ep(lp lpVar, Context context) {
        this.f37522b = lpVar;
        this.f37521a = context;
    }

    @Override
    public final void c() {
        this.f37522b.X(true);
    }

    @Override
    public final void i() {
        lp lpVar = this.f37522b;
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(this.f37521a, lpVar.f39816l0, lpVar.Y, lpVar.f39819o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.f37522b;
        lpVar2.f39820p0 = w70Var;
        lpVar2.f39820p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
