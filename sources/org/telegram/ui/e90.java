package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class e90 implements e2.h {
    public final int f33229a = 0;
    public final LaunchActivity f33230b;
    public final nf.e f33231c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.t1 f33232f;
    public final Object f33233g;

    public e90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f33230b = launchActivity;
        this.f33231c = eVar;
        this.e = l4;
        this.f33233g = tL_premium_boostsStatus;
        this.f33232f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e90.accept(java.lang.Object):void");
    }

    public e90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f33230b = launchActivity;
        this.f33231c = eVar;
        this.d = runnable;
        this.f33233g = channelBoostsController;
        this.e = l4;
        this.f33232f = t1Var;
    }
}
