package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class m5 implements e2.h {
    public final int f35688a;
    public final v5 f35689b;

    public m5(v5 v5Var, int i10) {
        this.f35688a = i10;
        this.f35689b = v5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35688a) {
            case 0:
                this.f35689b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(1, this.f35689b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
