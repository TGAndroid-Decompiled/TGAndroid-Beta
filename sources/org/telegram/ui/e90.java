package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class e90 implements Utilities.Callback {
    public final int f37200a;
    public final Object f37201b;
    public final Object f37202c;
    public final Object d;
    public final Object f37203e;
    public final Object f37204f;
    public final Object f37205g;

    public e90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f37200a = i10;
        this.f37201b = obj;
        this.f37202c = obj2;
        this.f37203e = obj3;
        this.f37205g = obj4;
        this.f37204f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e90.run(java.lang.Object):void");
    }

    public e90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f37200a = 1;
        this.f37201b = launchActivity;
        this.f37202c = eVar;
        this.d = runnable;
        this.f37205g = channelBoostsController;
        this.f37203e = l4;
        this.f37204f = u1Var;
    }
}
