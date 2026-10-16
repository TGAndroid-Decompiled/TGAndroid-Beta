package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class gp implements org.telegram.ui.Components.v90 {
    public final Context f36284a;
    public final np f36285b;

    public gp(np npVar, Context context) {
        this.f36285b = npVar;
        this.f36284a = context;
    }

    @Override
    public final void d() {
        this.f36285b.X(true);
    }

    @Override
    public final void i() {
        np npVar = this.f36285b;
        org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(this.f36284a, npVar.f38447l0, npVar.Y, npVar.f38450o0, npVar, npVar.Z, true, ChatObject.isChannel(npVar.X));
        np npVar2 = this.f36285b;
        npVar2.f38451p0 = p70Var;
        npVar2.f38451p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void j() {
    }
}
