package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f37321a;
    public final Object f37322b;
    public final Object f37323c;
    public final Object d;
    public final Object e;
    public final Object f37324f;
    public final Object f37325g;

    public j90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f37321a = i10;
        this.f37322b = obj;
        this.f37323c = obj2;
        this.e = obj3;
        this.f37325g = obj4;
        this.f37324f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j90.run(java.lang.Object):void");
    }

    public j90(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f37321a = 1;
        this.f37322b = launchActivity;
        this.f37323c = cVar;
        this.d = runnable;
        this.f37325g = channelBoostsController;
        this.e = l4;
        this.f37324f = u1Var;
    }
}
