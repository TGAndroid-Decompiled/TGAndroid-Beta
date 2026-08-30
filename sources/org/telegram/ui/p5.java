package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements h5.d {
    public final int f37183a;
    public final y5 f37184b;

    public p5(y5 y5Var, int i10) {
        this.f37183a = i10;
        this.f37184b = y5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37183a) {
            case 0:
                this.f37184b.P = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(19, this.f37184b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
