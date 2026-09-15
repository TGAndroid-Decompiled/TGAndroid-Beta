package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements e2.h {
    public final int f33859a;
    public final ad f33860b;

    public gc(ad adVar, int i10) {
        this.f33859a = i10;
        this.f33860b = adVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33859a) {
            case 0:
                ad.V(this.f33860b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f33860b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
