package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class q5 implements Utilities.Callback {
    public final int f39062a;
    public final z5 f39063b;

    public q5(z5 z5Var, int i10) {
        this.f39062a = i10;
        this.f39063b = z5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39062a) {
            case 0:
                this.f39063b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(14, this.f39063b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
