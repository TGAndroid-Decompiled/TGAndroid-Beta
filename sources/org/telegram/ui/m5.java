package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements e2.h {
    public final int f35683a;
    public final v5 f35684b;

    public m5(v5 v5Var, int i10) {
        this.f35683a = i10;
        this.f35684b = v5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35683a) {
            case 0:
                this.f35684b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(1, this.f35684b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
