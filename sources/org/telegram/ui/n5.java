package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class n5 implements d5.d {

    public final int f40663a;

    public final v5 f40664b;

    public n5(v5 v5Var, int i10) {
        this.f40663a = i10;
        this.f40664b = v5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f40663a) {
            case 0:
                this.f40664b.O = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(13, this.f40664b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
