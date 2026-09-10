package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class cp implements e2.h {
    public final int f22210a;
    public final sp f22211b;

    public cp(sp spVar, int i10) {
        this.f22210a = i10;
        this.f22211b = spVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f22210a) {
            case 0:
                sp spVar = this.f22211b;
                spVar.f27139f0 = (TL_stories.TL_premium_boostsStatus) obj;
                spVar.f27137e0 = true;
                spVar.E(true);
                spVar.f27136d0 = false;
                return;
            default:
                sp.m(this.f22211b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
