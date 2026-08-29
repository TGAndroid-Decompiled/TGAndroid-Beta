package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class n80 implements f5.d {
    public final int f40740a = 0;
    public final LaunchActivity f40741b;
    public final ye.c f40742c;
    public final Runnable d;
    public final Long f40743e;
    public final org.telegram.ui.Cells.s1 f40744f;
    public final Object f40745g;

    public n80(LaunchActivity launchActivity, ye.c cVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.s1 s1Var, Runnable runnable) {
        this.f40741b = launchActivity;
        this.f40742c = cVar;
        this.f40743e = l10;
        this.f40745g = tL_premium_boostsStatus;
        this.f40744f = s1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n80.accept(java.lang.Object):void");
    }

    public n80(LaunchActivity launchActivity, ye.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.s1 s1Var) {
        this.f40741b = launchActivity;
        this.f40742c = cVar;
        this.d = runnable;
        this.f40745g = channelBoostsController;
        this.f40743e = l10;
        this.f40744f = s1Var;
    }
}
