package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class l80 implements Utilities.Callback {
    public final int f38839a;
    public final Object f38840b;
    public final Object f38841c;
    public final Object d;
    public final Object e;
    public final Object f38842f;
    public final Object f38843g;

    public l80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38839a = i10;
        this.f38840b = obj;
        this.f38841c = obj2;
        this.e = obj3;
        this.f38843g = obj4;
        this.f38842f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.run(java.lang.Object):void");
    }

    public l80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f38839a = 1;
        this.f38840b = launchActivity;
        this.f38841c = cVar;
        this.d = runnable;
        this.f38843g = channelBoostsController;
        this.e = l4;
        this.f38842f = u1Var;
    }
}
