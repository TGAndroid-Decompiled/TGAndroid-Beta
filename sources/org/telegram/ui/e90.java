package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class e90 implements e2.h {
    public final int f33276a = 0;
    public final LaunchActivity f33277b;
    public final nf.e f33278c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.t1 f33279f;
    public final Object f33280g;

    public e90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f33277b = launchActivity;
        this.f33278c = eVar;
        this.e = l4;
        this.f33280g = tL_premium_boostsStatus;
        this.f33279f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e90.accept(java.lang.Object):void");
    }

    public e90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f33277b = launchActivity;
        this.f33278c = eVar;
        this.d = runnable;
        this.f33280g = channelBoostsController;
        this.e = l4;
        this.f33279f = t1Var;
    }
}
