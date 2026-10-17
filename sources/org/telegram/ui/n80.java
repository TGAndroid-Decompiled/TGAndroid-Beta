package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class n80 implements Utilities.Callback {
    public final int f39369a;
    public final Object f39370b;
    public final Object f39371c;
    public final Object d;
    public final Object e;
    public final Object f39372f;
    public final Object f39373g;

    public n80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39369a = i10;
        this.f39370b = obj;
        this.f39371c = obj2;
        this.e = obj3;
        this.f39373g = obj4;
        this.f39372f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n80.run(java.lang.Object):void");
    }

    public n80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f39369a = 1;
        this.f39370b = launchActivity;
        this.f39371c = cVar;
        this.d = runnable;
        this.f39373g = channelBoostsController;
        this.e = l4;
        this.f39372f = u1Var;
    }
}
