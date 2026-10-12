package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class op implements Utilities.Callback {
    public final int f29266a;
    public final eq f29267b;

    public op(eq eqVar, int i10) {
        this.f29266a = i10;
        this.f29267b = eqVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29266a) {
            case 0:
                eq eqVar = this.f29267b;
                eqVar.f25753f0 = (TL_stories.TL_premium_boostsStatus) obj;
                eqVar.f25751e0 = true;
                eqVar.G(true);
                eqVar.f25749d0 = false;
                return;
            default:
                eq.o(this.f29267b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
