package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f29708a;
    public final mp f29709b;

    public wo(mp mpVar, int i10) {
        this.f29708a = i10;
        this.f29709b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29708a) {
            case 0:
                mp mpVar = this.f29709b;
                mpVar.f26228f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26226e0 = true;
                mpVar.F(true);
                mpVar.f26225d0 = false;
                return;
            default:
                mp.m(this.f29709b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
