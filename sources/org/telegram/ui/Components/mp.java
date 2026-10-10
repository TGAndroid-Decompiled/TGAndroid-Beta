package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class mp implements Utilities.Callback {
    public final int f28863a;
    public final cq f28864b;

    public mp(cq cqVar, int i10) {
        this.f28863a = i10;
        this.f28864b = cqVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28863a) {
            case 0:
                cq cqVar = this.f28864b;
                cqVar.f25369f0 = (TL_stories.TL_premium_boostsStatus) obj;
                cqVar.f25367e0 = true;
                cqVar.G(true);
                cqVar.f25365d0 = false;
                return;
            default:
                cq.o(this.f28864b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
