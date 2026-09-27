package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class o5 implements Utilities.Callback {
    public final int f36136a;
    public final x5 f36137b;

    public o5(x5 x5Var, int i10) {
        this.f36136a = i10;
        this.f36137b = x5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36136a) {
            case 0:
                this.f36137b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new n(4, this.f36137b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
