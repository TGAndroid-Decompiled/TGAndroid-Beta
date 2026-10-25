package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class q80 implements Utilities.Callback {
    public final int f42758a;
    public final Object f42759b;
    public final Object f42760c;
    public final Object d;
    public final Object e;
    public final Object f42761f;
    public final Object f42762g;

    public q80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f42758a = i10;
        this.f42759b = obj;
        this.f42760c = obj2;
        this.e = obj3;
        this.f42762g = obj4;
        this.f42761f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q80.run(java.lang.Object):void");
    }

    public q80(LaunchActivity launchActivity, qf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.s1 s1Var) {
        this.f42758a = 1;
        this.f42759b = launchActivity;
        this.f42760c = cVar;
        this.d = runnable;
        this.f42762g = channelBoostsController;
        this.e = l4;
        this.f42761f = s1Var;
    }
}
