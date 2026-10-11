package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class d90 implements Utilities.Callback {
    public final int f36956a;
    public final Object f36957b;
    public final Object f36958c;
    public final Object d;
    public final Object f36959e;
    public final Object f36960f;
    public final Object f36961g;

    public d90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36956a = i10;
        this.f36957b = obj;
        this.f36958c = obj2;
        this.f36959e = obj3;
        this.f36961g = obj4;
        this.f36960f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d90.run(java.lang.Object):void");
    }

    public d90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f36956a = 1;
        this.f36957b = launchActivity;
        this.f36958c = eVar;
        this.d = runnable;
        this.f36961g = channelBoostsController;
        this.f36959e = l4;
        this.f36960f = u1Var;
    }
}
