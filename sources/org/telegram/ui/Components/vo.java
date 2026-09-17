package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class vo implements e2.h {
    public final int f31379a;
    public final lp f31380b;

    public vo(lp lpVar, int i10) {
        this.f31379a = i10;
        this.f31380b = lpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31379a) {
            case 0:
                lp lpVar = this.f31380b;
                lpVar.f28265f0 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.f28263e0 = true;
                lpVar.F(true);
                lpVar.f28261d0 = false;
                return;
            default:
                lp.m(this.f31380b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
