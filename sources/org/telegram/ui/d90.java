package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class d90 implements Utilities.Callback {
    public final int f36990a;
    public final Object f36991b;
    public final Object f36992c;
    public final Object d;
    public final Object f36993e;
    public final Object f36994f;
    public final Object f36995g;

    public d90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36990a = i10;
        this.f36991b = obj;
        this.f36992c = obj2;
        this.f36993e = obj3;
        this.f36995g = obj4;
        this.f36994f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d90.run(java.lang.Object):void");
    }

    public d90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f36990a = 1;
        this.f36991b = launchActivity;
        this.f36992c = eVar;
        this.d = runnable;
        this.f36995g = channelBoostsController;
        this.f36993e = l4;
        this.f36994f = u1Var;
    }
}
