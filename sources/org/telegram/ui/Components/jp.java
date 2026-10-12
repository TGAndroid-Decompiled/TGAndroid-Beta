package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class jp implements Utilities.Callback {
    public final int f26427a;
    public final zp f26428b;

    public jp(zp zpVar, int i10) {
        this.f26427a = i10;
        this.f26428b = zpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26427a) {
            case 0:
                zp zpVar = this.f26428b;
                zpVar.f31948f0 = (TL_stories.TL_premium_boostsStatus) obj;
                zpVar.f31946e0 = true;
                zpVar.G(true);
                zpVar.f31945d0 = false;
                return;
            default:
                zp.n(this.f26428b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
