package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements Utilities.Callback {
    public final int f40850a;
    public final y5 f40851b;

    public p5(y5 y5Var, int i10) {
        this.f40850a = i10;
        this.f40851b = y5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40850a) {
            case 0:
                this.f40851b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(5, this.f40851b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
