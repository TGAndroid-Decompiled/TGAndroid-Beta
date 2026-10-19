package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class po implements org.telegram.ui.Components.p90 {
    public final Context f40263a;
    public final wo f40264b;

    public po(wo woVar, Context context) {
        this.f40264b = woVar;
        this.f40263a = context;
    }

    @Override
    public final void d() {
        this.f40264b.X(true);
    }

    @Override
    public final void i() {
        wo woVar = this.f40264b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.f40263a, woVar.f42916l0, woVar.Y, woVar.f42919o0, woVar, woVar.Z, true, ChatObject.isChannel(woVar.X));
        wo woVar2 = this.f40264b;
        woVar2.f42920p0 = l70Var;
        woVar2.f42920p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
