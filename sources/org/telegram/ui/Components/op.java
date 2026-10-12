package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class op implements Utilities.Callback {
    public final int f29269a;
    public final eq f29270b;

    public op(eq eqVar, int i10) {
        this.f29269a = i10;
        this.f29270b = eqVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29269a) {
            case 0:
                eq eqVar = this.f29270b;
                eqVar.f25753f0 = (TL_stories.TL_premium_boostsStatus) obj;
                eqVar.f25751e0 = true;
                eqVar.G(true);
                eqVar.f25749d0 = false;
                return;
            default:
                eq.o(this.f29270b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
