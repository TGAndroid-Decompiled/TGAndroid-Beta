package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ep implements Utilities.Callback {
    public final int f26089a;
    public final up f26090b;

    public ep(up upVar, int i10) {
        this.f26089a = i10;
        this.f26090b = upVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26089a) {
            case 0:
                up upVar = this.f26090b;
                upVar.f31180e0 = (TL_stories.TL_premium_boostsStatus) obj;
                upVar.f31179d0 = true;
                upVar.L(true);
                upVar.f31178c0 = false;
                return;
            default:
                up.m(this.f26090b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
