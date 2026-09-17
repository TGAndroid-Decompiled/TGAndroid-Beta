package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class vo implements e2.h {
    public final int f31406a;
    public final lp f31407b;

    public vo(lp lpVar, int i10) {
        this.f31406a = i10;
        this.f31407b = lpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31406a) {
            case 0:
                lp lpVar = this.f31407b;
                lpVar.f28292f0 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.f28290e0 = true;
                lpVar.F(true);
                lpVar.f28288d0 = false;
                return;
            default:
                lp.m(this.f31407b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
