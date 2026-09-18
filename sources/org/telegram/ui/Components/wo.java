package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f29711a;
    public final mp f29712b;

    public wo(mp mpVar, int i10) {
        this.f29711a = i10;
        this.f29712b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29711a) {
            case 0:
                mp mpVar = this.f29712b;
                mpVar.f26231f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26229e0 = true;
                mpVar.F(true);
                mpVar.f26228d0 = false;
                return;
            default:
                mp.m(this.f29712b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
