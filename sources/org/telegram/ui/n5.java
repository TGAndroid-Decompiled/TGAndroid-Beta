package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class n5 implements Utilities.Callback {
    public final int f38814a;
    public final w5 f38815b;

    public n5(w5 w5Var, int i10) {
        this.f38814a = i10;
        this.f38815b = w5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38814a) {
            case 0:
                this.f38815b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(5, this.f38815b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
