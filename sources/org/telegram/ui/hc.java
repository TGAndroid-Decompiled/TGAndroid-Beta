package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class hc implements e2.h {
    public final int f34118a;
    public final bd f34119b;

    public hc(bd bdVar, int i10) {
        this.f34118a = i10;
        this.f34119b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34118a) {
            case 0:
                bd.V(this.f34119b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f34119b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
