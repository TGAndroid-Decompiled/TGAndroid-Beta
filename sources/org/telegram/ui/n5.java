package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class n5 implements Utilities.Callback {
    public final int f35436a;
    public final w5 f35437b;

    public n5(w5 w5Var, int i10) {
        this.f35436a = i10;
        this.f35437b = w5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35436a) {
            case 0:
                this.f35437b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4(1, this.f35437b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
