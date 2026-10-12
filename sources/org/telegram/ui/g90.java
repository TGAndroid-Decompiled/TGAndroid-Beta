package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class g90 implements Utilities.Callback {
    public final int f37983a;
    public final Object f37984b;
    public final Object f37985c;
    public final Object d;
    public final Object f37986e;
    public final Object f37987f;
    public final Object f37988g;

    public g90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f37983a = i10;
        this.f37984b = obj;
        this.f37985c = obj2;
        this.f37986e = obj3;
        this.f37988g = obj4;
        this.f37987f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run(java.lang.Object):void");
    }

    public g90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f37983a = 1;
        this.f37984b = launchActivity;
        this.f37985c = eVar;
        this.d = runnable;
        this.f37988g = channelBoostsController;
        this.f37986e = l4;
        this.f37987f = u1Var;
    }
}
