package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class q5 implements Utilities.Callback {
    public final int f40622a;
    public final y5 f40623b;

    public q5(y5 y5Var, int i10) {
        this.f40622a = i10;
        this.f40623b = y5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40622a) {
            case 0:
                this.f40623b.U = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new h0(3, this.f40623b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
