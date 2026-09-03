package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ro implements h5.d {
    public final int f28546a;
    public final jp f28547b;

    public ro(jp jpVar, int i10) {
        this.f28546a = i10;
        this.f28547b = jpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28546a) {
            case 0:
                jp jpVar = this.f28547b;
                jpVar.f26010c0 = (TL_stories.TL_premium_boostsStatus) obj;
                jpVar.f26008b0 = true;
                jpVar.E(true);
                jpVar.f26006a0 = false;
                return;
            default:
                jp.m(this.f28547b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
