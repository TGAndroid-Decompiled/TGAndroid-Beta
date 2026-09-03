package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ec implements h5.d {
    public final int f36430a;
    public final bd f36431b;

    public ec(bd bdVar, int i10) {
        this.f36430a = i10;
        this.f36431b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36430a) {
            case 0:
                bd.W(this.f36431b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f36431b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
