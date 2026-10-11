package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class mp implements Utilities.Callback {
    public final int f28813a;
    public final cq f28814b;

    public mp(cq cqVar, int i10) {
        this.f28813a = i10;
        this.f28814b = cqVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28813a) {
            case 0:
                cq cqVar = this.f28814b;
                cqVar.f25270f0 = (TL_stories.TL_premium_boostsStatus) obj;
                cqVar.f25268e0 = true;
                cqVar.G(true);
                cqVar.f25266d0 = false;
                return;
            default:
                cq.o(this.f28814b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
