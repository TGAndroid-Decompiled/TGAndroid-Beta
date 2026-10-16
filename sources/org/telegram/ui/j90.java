package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f36991a;
    public final Object f36992b;
    public final Object f36993c;
    public final Object d;
    public final Object e;
    public final Object f36994f;
    public final Object f36995g;

    public j90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36991a = i10;
        this.f36992b = obj;
        this.f36993c = obj2;
        this.e = obj3;
        this.f36995g = obj4;
        this.f36994f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j90.run(java.lang.Object):void");
    }

    public j90(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f36991a = 1;
        this.f36992b = launchActivity;
        this.f36993c = cVar;
        this.d = runnable;
        this.f36995g = channelBoostsController;
        this.e = l4;
        this.f36994f = u1Var;
    }
}
