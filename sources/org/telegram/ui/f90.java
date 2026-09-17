package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class f90 implements e2.h {
    public final int f36344a = 0;
    public final LaunchActivity f36345b;
    public final of.e f36346c;
    public final Runnable d;
    public final Long f36347e;
    public final org.telegram.ui.Cells.t1 f36348f;
    public final Object f36349g;

    public f90(LaunchActivity launchActivity, of.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f36345b = launchActivity;
        this.f36346c = eVar;
        this.f36347e = l4;
        this.f36349g = tL_premium_boostsStatus;
        this.f36348f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f90.accept(java.lang.Object):void");
    }

    public f90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f36345b = launchActivity;
        this.f36346c = eVar;
        this.d = runnable;
        this.f36349g = channelBoostsController;
        this.f36347e = l4;
        this.f36348f = t1Var;
    }
}
