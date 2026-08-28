package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements d5.d {
    public final int f40328a;
    public final u5 f40329b;

    public m5(u5 u5Var, int i9) {
        this.f40328a = i9;
        this.f40329b = u5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f40328a) {
            case 0:
                this.f40329b.O = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(13, this.f40329b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
