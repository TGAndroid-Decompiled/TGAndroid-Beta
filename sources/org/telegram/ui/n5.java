package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class n5 implements f5.d {
    public final int f40712a;
    public final v5 f40713b;

    public n5(v5 v5Var, int i10) {
        this.f40712a = i10;
        this.f40713b = v5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f40712a) {
            case 0:
                this.f40713b.O = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(10, this.f40713b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
