package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class uo implements h5.d {
    public final int f31656a;
    public final mp f31657b;

    public uo(mp mpVar, int i10) {
        this.f31656a = i10;
        this.f31657b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31656a) {
            case 0:
                mp mpVar = this.f31657b;
                mpVar.f29213c0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f29211b0 = true;
                mpVar.E(true);
                mpVar.f29209a0 = false;
                return;
            default:
                mp.m(this.f31657b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
