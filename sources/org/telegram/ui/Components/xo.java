package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xo implements Utilities.Callback {
    public final int f30362a;
    public final np f30363b;

    public xo(np npVar, int i10) {
        this.f30362a = i10;
        this.f30363b = npVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30362a) {
            case 0:
                np npVar = this.f30363b;
                npVar.f26761f0 = (TL_stories.TL_premium_boostsStatus) obj;
                npVar.f26759e0 = true;
                npVar.F(true);
                npVar.f26758d0 = false;
                return;
            default:
                np.m(this.f30363b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
