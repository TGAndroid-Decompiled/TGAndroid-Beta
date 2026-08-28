package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class bc implements d5.d {
    public final int f36821a;
    public final xc f36822b;

    public bc(xc xcVar, int i9) {
        this.f36821a = i9;
        this.f36822b = xcVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36821a) {
            case 0:
                xc.V(this.f36822b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f36822b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
