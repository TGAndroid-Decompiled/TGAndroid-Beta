package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ic implements e2.h {
    public final int f33609a;
    public final cd f33610b;

    public ic(cd cdVar, int i10) {
        this.f33609a = i10;
        this.f33610b = cdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33609a) {
            case 0:
                cd.V(this.f33610b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f33610b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
