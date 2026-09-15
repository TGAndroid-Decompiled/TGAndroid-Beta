package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f29759a;
    public final mp f29760b;

    public wo(mp mpVar, int i10) {
        this.f29759a = i10;
        this.f29760b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29759a) {
            case 0:
                mp mpVar = this.f29760b;
                mpVar.f26201f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26199e0 = true;
                mpVar.F(true);
                mpVar.f26198d0 = false;
                return;
            default:
                mp.m(this.f29760b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
