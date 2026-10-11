package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements Utilities.Callback {
    public final int f39513a;
    public final u5 f39514b;

    public l5(u5 u5Var, int i10) {
        this.f39513a = i10;
        this.f39514b = u5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39513a) {
            case 0:
                this.f39514b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(7, this.f39514b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
