package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements Utilities.Callback {
    public final int f39768a;
    public final v5 f39769b;

    public m5(v5 v5Var, int i10) {
        this.f39768a = i10;
        this.f39769b = v5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39768a) {
            case 0:
                this.f39769b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(8, this.f39769b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
