package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements Utilities.Callback {
    public final int f40848a;
    public final y5 f40849b;

    public p5(y5 y5Var, int i10) {
        this.f40848a = i10;
        this.f40849b = y5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40848a) {
            case 0:
                this.f40849b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(5, this.f40849b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
