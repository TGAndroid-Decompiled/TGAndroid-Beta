package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements Utilities.Callback {
    public final int f42353a;
    public final x5 f42354b;

    public p5(x5 x5Var, int i10) {
        this.f42353a = i10;
        this.f42354b = x5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42353a) {
            case 0:
                this.f42354b.U = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(14, this.f42354b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
