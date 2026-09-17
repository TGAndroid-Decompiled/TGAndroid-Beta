package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ic implements e2.h {
    public final int f34524a;
    public final cd f34525b;

    public ic(cd cdVar, int i10) {
        this.f34524a = i10;
        this.f34525b = cdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34524a) {
            case 0:
                cd.V(this.f34525b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f34525b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
