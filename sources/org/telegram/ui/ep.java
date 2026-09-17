package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ep implements org.telegram.ui.Components.v80 {
    public final Context f36163a;
    public final lp f36164b;

    public ep(lp lpVar, Context context) {
        this.f36164b = lpVar;
        this.f36163a = context;
    }

    @Override
    public final void c() {
        this.f36164b.X(true);
    }

    @Override
    public final void d() {
        lp lpVar = this.f36164b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f36163a, lpVar.f38467l0, lpVar.Y, lpVar.f38470o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.f36164b;
        lpVar2.f38471p0 = r60Var;
        lpVar2.f38471p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }
}
