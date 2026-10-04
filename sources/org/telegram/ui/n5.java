package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class n5 implements Utilities.Callback {
    public final int f38813a;
    public final w5 f38814b;

    public n5(w5 w5Var, int i10) {
        this.f38813a = i10;
        this.f38814b = w5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38813a) {
            case 0:
                this.f38814b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(5, this.f38814b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
