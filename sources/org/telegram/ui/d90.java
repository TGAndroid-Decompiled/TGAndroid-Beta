package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class d90 implements Utilities.Callback {
    public final int f35703a = 0;
    public final LaunchActivity f35704b;
    public final nf.e f35705c;
    public final Runnable d;
    public final Long f35706e;
    public final org.telegram.ui.Cells.u1 f35707f;
    public final Object f35708g;

    public d90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.u1 u1Var, Runnable runnable) {
        this.f35704b = launchActivity;
        this.f35705c = eVar;
        this.f35706e = l4;
        this.f35708g = tL_premium_boostsStatus;
        this.f35707f = u1Var;
        this.d = runnable;
    }

    @Override
    public final void run(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d90.run(java.lang.Object):void");
    }

    public d90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.f35704b = launchActivity;
        this.f35705c = eVar;
        this.d = runnable;
        this.f35708g = channelBoostsController;
        this.f35706e = l4;
        this.f35707f = u1Var;
    }
}
