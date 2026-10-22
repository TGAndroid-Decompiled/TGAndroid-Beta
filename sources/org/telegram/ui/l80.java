package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class l80 implements Utilities.Callback {
    public final int f38843a;
    public final Object f38844b;
    public final Object f38845c;
    public final Object d;
    public final Object e;
    public final Object f38846f;
    public final Object f38847g;

    public l80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38843a = i10;
        this.f38844b = obj;
        this.f38845c = obj2;
        this.e = obj3;
        this.f38847g = obj4;
        this.f38846f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.run(java.lang.Object):void");
    }

    public l80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f38843a = 1;
        this.f38844b = launchActivity;
        this.f38845c = cVar;
        this.d = runnable;
        this.f38847g = channelBoostsController;
        this.e = l4;
        this.f38846f = u1Var;
    }
}
