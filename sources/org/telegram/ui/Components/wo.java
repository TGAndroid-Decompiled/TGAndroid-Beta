package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f30121a;
    public final mp f30122b;

    public wo(mp mpVar, int i10) {
        this.f30121a = i10;
        this.f30122b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30121a) {
            case 0:
                mp mpVar = this.f30122b;
                mpVar.f26482f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26480e0 = true;
                mpVar.F(true);
                mpVar.f26479d0 = false;
                return;
            default:
                mp.m(this.f30122b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
