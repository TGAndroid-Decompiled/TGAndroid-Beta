package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class mp implements Utilities.Callback {
    public final int f28879a;
    public final cq f28880b;

    public mp(cq cqVar, int i10) {
        this.f28879a = i10;
        this.f28880b = cqVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28879a) {
            case 0:
                cq cqVar = this.f28880b;
                cqVar.f25470f0 = (TL_stories.TL_premium_boostsStatus) obj;
                cqVar.f25468e0 = true;
                cqVar.G(true);
                cqVar.f25466d0 = false;
                return;
            default:
                cq.o(this.f28880b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
