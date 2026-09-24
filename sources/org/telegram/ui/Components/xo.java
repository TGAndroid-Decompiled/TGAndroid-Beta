package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xo implements Utilities.Callback {
    public final int f30354a;
    public final np f30355b;

    public xo(np npVar, int i10) {
        this.f30354a = i10;
        this.f30355b = npVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30354a) {
            case 0:
                np npVar = this.f30355b;
                npVar.f26753f0 = (TL_stories.TL_premium_boostsStatus) obj;
                npVar.f26751e0 = true;
                npVar.F(true);
                npVar.f26750d0 = false;
                return;
            default:
                np.m(this.f30355b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
