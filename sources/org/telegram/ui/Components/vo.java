package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class vo implements e2.h {
    public final int f31405a;
    public final lp f31406b;

    public vo(lp lpVar, int i10) {
        this.f31405a = i10;
        this.f31406b = lpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31405a) {
            case 0:
                lp lpVar = this.f31406b;
                lpVar.f28291f0 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.f28289e0 = true;
                lpVar.F(true);
                lpVar.f28287d0 = false;
                return;
            default:
                lp.m(this.f31406b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
