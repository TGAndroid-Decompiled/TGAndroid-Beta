package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class e90 implements Utilities.Callback {
    public final int f37202a;
    public final Object f37203b;
    public final Object f37204c;
    public final Object d;
    public final Object f37205e;
    public final Object f37206f;
    public final Object f37207g;

    public e90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f37202a = i10;
        this.f37203b = obj;
        this.f37204c = obj2;
        this.f37205e = obj3;
        this.f37207g = obj4;
        this.f37206f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e90.run(java.lang.Object):void");
    }

    public e90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f37202a = 1;
        this.f37203b = launchActivity;
        this.f37204c = eVar;
        this.d = runnable;
        this.f37207g = channelBoostsController;
        this.f37205e = l4;
        this.f37206f = u1Var;
    }
}
