package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class fc implements h5.d {
    public final int f34212a;
    public final bd f34213b;

    public fc(bd bdVar, int i10) {
        this.f34212a = i10;
        this.f34213b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34212a) {
            case 0:
                bd.W(this.f34213b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f34213b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
