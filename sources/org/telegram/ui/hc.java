package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class hc implements e2.h {
    public final int f34162a;
    public final bd f34163b;

    public hc(bd bdVar, int i10) {
        this.f34162a = i10;
        this.f34163b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34162a) {
            case 0:
                bd.V(this.f34163b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f34163b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
