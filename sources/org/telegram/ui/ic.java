package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ic implements e2.h {
    public final int f34529a;
    public final cd f34530b;

    public ic(cd cdVar, int i10) {
        this.f34529a = i10;
        this.f34530b = cdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34529a) {
            case 0:
                cd.V(this.f34530b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f34530b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
