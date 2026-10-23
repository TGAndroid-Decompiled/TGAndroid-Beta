package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class l80 implements Utilities.Callback {
    public final int f38844a;
    public final Object f38845b;
    public final Object f38846c;
    public final Object d;
    public final Object e;
    public final Object f38847f;
    public final Object f38848g;

    public l80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38844a = i10;
        this.f38845b = obj;
        this.f38846c = obj2;
        this.e = obj3;
        this.f38848g = obj4;
        this.f38847f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.run(java.lang.Object):void");
    }

    public l80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f38844a = 1;
        this.f38845b = launchActivity;
        this.f38846c = cVar;
        this.d = runnable;
        this.f38848g = channelBoostsController;
        this.e = l4;
        this.f38847f = u1Var;
    }
}
