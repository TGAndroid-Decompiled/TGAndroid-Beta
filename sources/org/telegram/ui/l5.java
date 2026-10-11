package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements Utilities.Callback {
    public final int f39547a;
    public final u5 f39548b;

    public l5(u5 u5Var, int i10) {
        this.f39547a = i10;
        this.f39548b = u5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39547a) {
            case 0:
                this.f39548b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(7, this.f39548b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
