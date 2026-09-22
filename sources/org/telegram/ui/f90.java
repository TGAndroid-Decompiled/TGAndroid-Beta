package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class f90 implements e2.h {
    public final int f33572a = 0;
    public final LaunchActivity f33573b;
    public final nf.e f33574c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.u1 f33575f;
    public final Object f33576g;

    public f90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.u1 u1Var, Runnable runnable) {
        this.f33573b = launchActivity;
        this.f33574c = eVar;
        this.e = l4;
        this.f33576g = tL_premium_boostsStatus;
        this.f33575f = u1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f90.accept(java.lang.Object):void");
    }

    public f90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f33573b = launchActivity;
        this.f33574c = eVar;
        this.d = runnable;
        this.f33576g = channelBoostsController;
        this.e = l4;
        this.f33575f = u1Var;
    }
}
