package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class n80 implements Utilities.Callback {
    public final int f39395a;
    public final Object f39396b;
    public final Object f39397c;
    public final Object d;
    public final Object e;
    public final Object f39398f;
    public final Object f39399g;

    public n80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39395a = i10;
        this.f39396b = obj;
        this.f39397c = obj2;
        this.e = obj3;
        this.f39399g = obj4;
        this.f39398f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n80.run(java.lang.Object):void");
    }

    public n80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f39395a = 1;
        this.f39396b = launchActivity;
        this.f39397c = cVar;
        this.d = runnable;
        this.f39399g = channelBoostsController;
        this.e = l4;
        this.f39398f = u1Var;
    }
}
