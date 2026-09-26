package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class a90 implements Utilities.Callback {
    public final int f32078a = 0;
    public final LaunchActivity f32079b;
    public final nf.e f32080c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.u1 f32081f;
    public final Object f32082g;

    public a90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.u1 u1Var, Runnable runnable) {
        this.f32079b = launchActivity;
        this.f32080c = eVar;
        this.e = l4;
        this.f32082g = tL_premium_boostsStatus;
        this.f32081f = u1Var;
        this.d = runnable;
    }

    @Override
    public final void run(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a90.run(java.lang.Object):void");
    }

    public a90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f32079b = launchActivity;
        this.f32080c = eVar;
        this.d = runnable;
        this.f32082g = channelBoostsController;
        this.e = l4;
        this.f32081f = u1Var;
    }
}
