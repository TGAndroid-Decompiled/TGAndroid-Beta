package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class po implements org.telegram.ui.Components.p90 {
    public final Context f40267a;
    public final wo f40268b;

    public po(wo woVar, Context context) {
        this.f40268b = woVar;
        this.f40267a = context;
    }

    @Override
    public final void d() {
        this.f40268b.X(true);
    }

    @Override
    public final void i() {
        wo woVar = this.f40268b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.f40267a, woVar.f42924l0, woVar.Y, woVar.f42927o0, woVar, woVar.Z, true, ChatObject.isChannel(woVar.X));
        wo woVar2 = this.f40268b;
        woVar2.f42928p0 = l70Var;
        woVar2.f42928p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
