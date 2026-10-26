package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class q80 implements Utilities.Callback {
    public final int f42761a;
    public final Object f42762b;
    public final Object f42763c;
    public final Object d;
    public final Object e;
    public final Object f42764f;
    public final Object f42765g;

    public q80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f42761a = i10;
        this.f42762b = obj;
        this.f42763c = obj2;
        this.e = obj3;
        this.f42765g = obj4;
        this.f42764f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q80.run(java.lang.Object):void");
    }

    public q80(LaunchActivity launchActivity, qf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.s1 s1Var) {
        this.f42761a = 1;
        this.f42762b = launchActivity;
        this.f42763c = cVar;
        this.d = runnable;
        this.f42765g = channelBoostsController;
        this.e = l4;
        this.f42764f = s1Var;
    }
}
