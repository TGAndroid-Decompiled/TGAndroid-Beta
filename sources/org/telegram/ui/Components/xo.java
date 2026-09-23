package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xo implements Utilities.Callback {
    public final int f30028a;
    public final np f30029b;

    public xo(np npVar, int i10) {
        this.f30028a = i10;
        this.f30029b = npVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30028a) {
            case 0:
                np npVar = this.f30029b;
                npVar.f26467f0 = (TL_stories.TL_premium_boostsStatus) obj;
                npVar.f26465e0 = true;
                npVar.F(true);
                npVar.f26464d0 = false;
                return;
            default:
                np.m(this.f30029b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
