package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements Utilities.Callback {
    public final int f35479a;
    public final v5 f35480b;

    public m5(v5 v5Var, int i10) {
        this.f35479a = i10;
        this.f35480b = v5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35479a) {
            case 0:
                this.f35480b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(6, this.f35480b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
