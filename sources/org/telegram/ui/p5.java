package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements h5.d {
    public final int f39892a;
    public final y5 f39893b;

    public p5(y5 y5Var, int i10) {
        this.f39892a = i10;
        this.f39893b = y5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39892a) {
            case 0:
                this.f39893b.P = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(17, this.f39893b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
