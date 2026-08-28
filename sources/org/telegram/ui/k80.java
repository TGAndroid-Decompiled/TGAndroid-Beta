package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class k80 implements d5.d {
    public final int f39767a = 0;
    public final LaunchActivity f39768b;
    public final ve.d f39769c;
    public final Runnable d;
    public final Long f39770e;
    public final org.telegram.ui.Cells.t1 f39771f;
    public final Object f39772g;

    public k80(LaunchActivity launchActivity, ve.d dVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f39768b = launchActivity;
        this.f39769c = dVar;
        this.f39770e = l10;
        this.f39772g = tL_premium_boostsStatus;
        this.f39771f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k80.accept(java.lang.Object):void");
    }

    public k80(LaunchActivity launchActivity, ve.d dVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.t1 t1Var) {
        this.f39768b = launchActivity;
        this.f39769c = dVar;
        this.d = runnable;
        this.f39772g = channelBoostsController;
        this.f39770e = l10;
        this.f39771f = t1Var;
    }
}
