package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements e2.h {
    public final int f36651a;
    public final bd f36652b;

    public gc(bd bdVar, int i10) {
        this.f36651a = i10;
        this.f36652b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36651a) {
            case 0:
                bd.V(this.f36652b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f36652b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
