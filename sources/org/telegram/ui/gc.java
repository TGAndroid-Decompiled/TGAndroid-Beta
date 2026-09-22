package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements e2.h {
    public final int f33811a;
    public final ad f33812b;

    public gc(ad adVar, int i10) {
        this.f33811a = i10;
        this.f33812b = adVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33811a) {
            case 0:
                ad.V(this.f33812b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f33812b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
