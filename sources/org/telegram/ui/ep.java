package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ep implements org.telegram.ui.Components.v80 {
    public final Context f36162a;
    public final lp f36163b;

    public ep(lp lpVar, Context context) {
        this.f36163b = lpVar;
        this.f36162a = context;
    }

    @Override
    public final void c() {
        this.f36163b.X(true);
    }

    @Override
    public final void d() {
        lp lpVar = this.f36163b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f36162a, lpVar.f38466l0, lpVar.Y, lpVar.f38469o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.f36163b;
        lpVar2.f38470p0 = r60Var;
        lpVar2.f38470p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }
}
