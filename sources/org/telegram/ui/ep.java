package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ep implements org.telegram.ui.Components.v80 {
    public final Context f36136a;
    public final lp f36137b;

    public ep(lp lpVar, Context context) {
        this.f36137b = lpVar;
        this.f36136a = context;
    }

    @Override
    public final void c() {
        this.f36137b.X(true);
    }

    @Override
    public final void d() {
        lp lpVar = this.f36137b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.f36136a, lpVar.f38440l0, lpVar.Y, lpVar.f38443o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.f36137b;
        lpVar2.f38444p0 = r60Var;
        lpVar2.f38444p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }
}
