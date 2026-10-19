package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class l80 implements Utilities.Callback {
    public final int f38835a;
    public final Object f38836b;
    public final Object f38837c;
    public final Object d;
    public final Object e;
    public final Object f38838f;
    public final Object f38839g;

    public l80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38835a = i10;
        this.f38836b = obj;
        this.f38837c = obj2;
        this.e = obj3;
        this.f38839g = obj4;
        this.f38838f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.run(java.lang.Object):void");
    }

    public l80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f38835a = 1;
        this.f38836b = launchActivity;
        this.f38837c = cVar;
        this.d = runnable;
        this.f38839g = channelBoostsController;
        this.e = l4;
        this.f38838f = u1Var;
    }
}
