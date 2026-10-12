package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class gp implements org.telegram.ui.Components.v90 {
    public final Context f36443a;
    public final np f36444b;

    public gp(np npVar, Context context) {
        this.f36444b = npVar;
        this.f36443a = context;
    }

    @Override
    public final void d() {
        this.f36444b.X(true);
    }

    @Override
    public final void h() {
        np npVar = this.f36444b;
        org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(this.f36443a, npVar.f38767l0, npVar.Y, npVar.f38770o0, npVar, npVar.Z, true, ChatObject.isChannel(npVar.X));
        np npVar2 = this.f36444b;
        npVar2.f38771p0 = p70Var;
        npVar2.f38771p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i() {
    }
}
