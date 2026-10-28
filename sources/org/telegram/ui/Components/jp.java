package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class jp implements Utilities.Callback {
    public final int f29707a;
    public final zp f29708b;

    public jp(zp zpVar, int i10) {
        this.f29707a = i10;
        this.f29708b = zpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29707a) {
            case 0:
                zp zpVar = this.f29708b;
                zpVar.f35414e0 = (TL_stories.TL_premium_boostsStatus) obj;
                zpVar.f35413d0 = true;
                zpVar.L(true);
                zpVar.f35412c0 = false;
                return;
            default:
                zp.m(this.f29708b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
