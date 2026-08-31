package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class uo implements h5.d {
    public final int f31695a;
    public final mp f31696b;

    public uo(mp mpVar, int i10) {
        this.f31695a = i10;
        this.f31696b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31695a) {
            case 0:
                mp mpVar = this.f31696b;
                mpVar.f29170c0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f29168b0 = true;
                mpVar.E(true);
                mpVar.f29166a0 = false;
                return;
            default:
                mp.m(this.f31696b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
