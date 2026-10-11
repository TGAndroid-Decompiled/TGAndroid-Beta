package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class mp implements Utilities.Callback {
    public final int f28903a;
    public final cq f28904b;

    public mp(cq cqVar, int i10) {
        this.f28903a = i10;
        this.f28904b = cqVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28903a) {
            case 0:
                cq cqVar = this.f28904b;
                cqVar.f25431f0 = (TL_stories.TL_premium_boostsStatus) obj;
                cqVar.f25429e0 = true;
                cqVar.G(true);
                cqVar.f25427d0 = false;
                return;
            default:
                cq.o(this.f28904b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
