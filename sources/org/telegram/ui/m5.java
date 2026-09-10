package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements e2.h {
    public final int f34844a;
    public final w5 f34845b;

    public m5(w5 w5Var, int i10) {
        this.f34844a = i10;
        this.f34845b = w5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34844a) {
            case 0:
                this.f34845b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new n(4, this.f34845b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
