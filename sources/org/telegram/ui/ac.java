package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ac implements f5.d {
    public final int f36505a;
    public final vc f36506b;

    public ac(vc vcVar, int i10) {
        this.f36505a = i10;
        this.f36506b = vcVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36505a) {
            case 0:
                vc.W(this.f36506b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f36506b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
