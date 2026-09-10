package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class e90 implements e2.h {
    public final int f32124a = 0;
    public final LaunchActivity f32125b;
    public final nf.e f32126c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.t1 f32127f;
    public final Object f32128g;

    public e90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f32125b = launchActivity;
        this.f32126c = eVar;
        this.e = l4;
        this.f32128g = tL_premium_boostsStatus;
        this.f32127f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e90.accept(java.lang.Object):void");
    }

    public e90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f32125b = launchActivity;
        this.f32126c = eVar;
        this.d = runnable;
        this.f32128g = channelBoostsController;
        this.e = l4;
        this.f32127f = t1Var;
    }
}
