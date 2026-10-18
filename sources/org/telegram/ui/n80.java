package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class n80 implements Utilities.Callback {
    public final int f39354a;
    public final Object f39355b;
    public final Object f39356c;
    public final Object d;
    public final Object e;
    public final Object f39357f;
    public final Object f39358g;

    public n80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39354a = i10;
        this.f39355b = obj;
        this.f39356c = obj2;
        this.e = obj3;
        this.f39358g = obj4;
        this.f39357f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n80.run(java.lang.Object):void");
    }

    public n80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f39354a = 1;
        this.f39355b = launchActivity;
        this.f39356c = cVar;
        this.d = runnable;
        this.f39358g = channelBoostsController;
        this.e = l4;
        this.f39357f = u1Var;
    }
}
