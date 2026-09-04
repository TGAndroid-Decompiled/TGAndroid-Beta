package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class vo implements e2.h {
    public final int f31378a;
    public final lp f31379b;

    public vo(lp lpVar, int i10) {
        this.f31378a = i10;
        this.f31379b = lpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31378a) {
            case 0:
                lp lpVar = this.f31379b;
                lpVar.f28264f0 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.f28262e0 = true;
                lpVar.F(true);
                lpVar.f28260d0 = false;
                return;
            default:
                lp.m(this.f31379b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
