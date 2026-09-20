package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f30075a;
    public final mp f30076b;

    public wo(mp mpVar, int i10) {
        this.f30075a = i10;
        this.f30076b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30075a) {
            case 0:
                mp mpVar = this.f30076b;
                mpVar.f26451f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26449e0 = true;
                mpVar.F(true);
                mpVar.f26448d0 = false;
                return;
            default:
                mp.m(this.f30076b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
