package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f30084a;
    public final mp f30085b;

    public wo(mp mpVar, int i10) {
        this.f30084a = i10;
        this.f30085b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30084a) {
            case 0:
                mp mpVar = this.f30085b;
                mpVar.f26503f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26501e0 = true;
                mpVar.E(true);
                mpVar.f26500d0 = false;
                return;
            default:
                mp.m(this.f30085b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
