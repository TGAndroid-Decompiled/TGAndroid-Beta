package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements e2.h {
    public final int f38572a;
    public final v5 f38573b;

    public m5(v5 v5Var, int i10) {
        this.f38572a = i10;
        this.f38573b = v5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38572a) {
            case 0:
                this.f38573b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(7, this.f38573b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
