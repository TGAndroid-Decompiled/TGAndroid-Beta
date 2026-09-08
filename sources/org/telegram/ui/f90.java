package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class f90 implements e2.h {
    public final int f36370a = 0;
    public final LaunchActivity f36371b;
    public final of.e f36372c;
    public final Runnable d;
    public final Long f36373e;
    public final org.telegram.ui.Cells.t1 f36374f;
    public final Object f36375g;

    public f90(LaunchActivity launchActivity, of.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f36371b = launchActivity;
        this.f36372c = eVar;
        this.f36373e = l4;
        this.f36375g = tL_premium_boostsStatus;
        this.f36374f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f90.accept(java.lang.Object):void");
    }

    public f90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f36371b = launchActivity;
        this.f36372c = eVar;
        this.d = runnable;
        this.f36375g = channelBoostsController;
        this.f36373e = l4;
        this.f36374f = t1Var;
    }
}
