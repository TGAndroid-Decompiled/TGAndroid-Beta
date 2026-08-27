package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class cc implements d5.d {

    public final int f37045a;

    public final xc f37046b;

    public cc(xc xcVar, int i10) {
        this.f37045a = i10;
        this.f37046b = xcVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37045a) {
            case 0:
                xc.W(this.f37046b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.f37046b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
