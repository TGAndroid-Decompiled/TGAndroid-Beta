package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ip implements Utilities.Callback {
    public final int f29328a;
    public final yp f29329b;

    public ip(yp ypVar, int i10) {
        this.f29328a = i10;
        this.f29329b = ypVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29328a) {
            case 0:
                yp ypVar = this.f29329b;
                ypVar.f35098e0 = (TL_stories.TL_premium_boostsStatus) obj;
                ypVar.f35097d0 = true;
                ypVar.L(true);
                ypVar.f35096c0 = false;
                return;
            default:
                yp.m(this.f29329b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
