package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class g90 implements Utilities.Callback {
    public final int f37981a;
    public final Object f37982b;
    public final Object f37983c;
    public final Object d;
    public final Object f37984e;
    public final Object f37985f;
    public final Object f37986g;

    public g90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f37981a = i10;
        this.f37982b = obj;
        this.f37983c = obj2;
        this.f37984e = obj3;
        this.f37986g = obj4;
        this.f37985f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run(java.lang.Object):void");
    }

    public g90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f37981a = 1;
        this.f37982b = launchActivity;
        this.f37983c = eVar;
        this.d = runnable;
        this.f37986g = channelBoostsController;
        this.f37984e = l4;
        this.f37985f = u1Var;
    }
}
