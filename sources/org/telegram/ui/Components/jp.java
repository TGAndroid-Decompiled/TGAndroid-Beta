package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class jp implements Utilities.Callback {
    public final int f26096a;
    public final zp f26097b;

    public jp(zp zpVar, int i10) {
        this.f26096a = i10;
        this.f26097b = zpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26096a) {
            case 0:
                zp zpVar = this.f26097b;
                zpVar.f31651f0 = (TL_stories.TL_premium_boostsStatus) obj;
                zpVar.f31649e0 = true;
                zpVar.G(true);
                zpVar.f31648d0 = false;
                return;
            default:
                zp.n(this.f26097b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
