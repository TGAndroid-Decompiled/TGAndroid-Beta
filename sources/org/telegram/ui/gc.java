package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements h5.d {
    public final int f34406a;
    public final dd f34407b;

    public gc(dd ddVar, int i10) {
        this.f34406a = i10;
        this.f34407b = ddVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34406a) {
            case 0:
                dd.W(this.f34407b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f34407b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
