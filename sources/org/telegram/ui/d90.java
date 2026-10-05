package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class d90 implements Utilities.Callback {
    public final int f35719a = 0;
    public final LaunchActivity f35720b;
    public final nf.e f35721c;
    public final Runnable d;
    public final Long f35722e;
    public final org.telegram.ui.Cells.u1 f35723f;
    public final Object f35724g;

    public d90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.u1 u1Var, Runnable runnable) {
        this.f35720b = launchActivity;
        this.f35721c = eVar;
        this.f35722e = l4;
        this.f35724g = tL_premium_boostsStatus;
        this.f35723f = u1Var;
        this.d = runnable;
    }

    @Override
    public final void run(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d90.run(java.lang.Object):void");
    }

    public d90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f35720b = launchActivity;
        this.f35721c = eVar;
        this.d = runnable;
        this.f35724g = channelBoostsController;
        this.f35722e = l4;
        this.f35723f = u1Var;
    }
}
