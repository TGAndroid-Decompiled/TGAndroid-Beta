package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class e90 implements Utilities.Callback {
    public final int f37246a;
    public final Object f37247b;
    public final Object f37248c;
    public final Object d;
    public final Object f37249e;
    public final Object f37250f;
    public final Object f37251g;

    public e90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f37246a = i10;
        this.f37247b = obj;
        this.f37248c = obj2;
        this.f37249e = obj3;
        this.f37251g = obj4;
        this.f37250f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e90.run(java.lang.Object):void");
    }

    public e90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f37246a = 1;
        this.f37247b = launchActivity;
        this.f37248c = eVar;
        this.d = runnable;
        this.f37251g = channelBoostsController;
        this.f37249e = l4;
        this.f37250f = u1Var;
    }
}
