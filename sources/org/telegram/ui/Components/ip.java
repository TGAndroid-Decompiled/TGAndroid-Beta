package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ip implements Utilities.Callback {
    public final int f29326a;
    public final yp f29327b;

    public ip(yp ypVar, int i10) {
        this.f29326a = i10;
        this.f29327b = ypVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29326a) {
            case 0:
                yp ypVar = this.f29327b;
                ypVar.f35095e0 = (TL_stories.TL_premium_boostsStatus) obj;
                ypVar.f35094d0 = true;
                ypVar.L(true);
                ypVar.f35093c0 = false;
                return;
            default:
                yp.m(this.f29327b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
