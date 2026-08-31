package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ec implements h5.d {
    public final int f36463a;
    public final bd f36464b;

    public ec(bd bdVar, int i10) {
        this.f36463a = i10;
        this.f36464b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36463a) {
            case 0:
                bd.W(this.f36464b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f36464b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
