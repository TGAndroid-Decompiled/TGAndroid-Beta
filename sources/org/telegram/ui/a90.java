package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class a90 implements Utilities.Callback {
    public final int f32080a = 0;
    public final LaunchActivity f32081b;
    public final nf.e f32082c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.u1 f32083f;
    public final Object f32084g;

    public a90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.u1 u1Var, Runnable runnable) {
        this.f32081b = launchActivity;
        this.f32082c = eVar;
        this.e = l4;
        this.f32084g = tL_premium_boostsStatus;
        this.f32083f = u1Var;
        this.d = runnable;
    }

    @Override
    public final void run(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a90.run(java.lang.Object):void");
    }

    public a90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f32081b = launchActivity;
        this.f32082c = eVar;
        this.d = runnable;
        this.f32084g = channelBoostsController;
        this.e = l4;
        this.f32083f = u1Var;
    }
}
