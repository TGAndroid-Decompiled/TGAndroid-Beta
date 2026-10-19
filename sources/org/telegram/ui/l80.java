package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class l80 implements Utilities.Callback {
    public final int f38833a;
    public final Object f38834b;
    public final Object f38835c;
    public final Object d;
    public final Object e;
    public final Object f38836f;
    public final Object f38837g;

    public l80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f38833a = i10;
        this.f38834b = obj;
        this.f38835c = obj2;
        this.e = obj3;
        this.f38837g = obj4;
        this.f38836f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.run(java.lang.Object):void");
    }

    public l80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f38833a = 1;
        this.f38834b = launchActivity;
        this.f38835c = cVar;
        this.d = runnable;
        this.f38837g = channelBoostsController;
        this.e = l4;
        this.f38836f = u1Var;
    }
}
