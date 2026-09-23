package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class b90 implements Utilities.Callback {
    public final int f32023a = 0;
    public final LaunchActivity f32024b;
    public final nf.e f32025c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.t1 f32026f;
    public final Object f32027g;

    public b90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f32024b = launchActivity;
        this.f32025c = eVar;
        this.e = l4;
        this.f32027g = tL_premium_boostsStatus;
        this.f32026f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void run(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b90.run(java.lang.Object):void");
    }

    public b90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f32024b = launchActivity;
        this.f32025c = eVar;
        this.d = runnable;
        this.f32027g = channelBoostsController;
        this.e = l4;
        this.f32026f = t1Var;
    }
}
