package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class ko implements d5.d {

    public final int f30159a;

    public final ap f30160b;

    public ko(ap apVar, int i10) {
        this.f30159a = i10;
        this.f30160b = apVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30159a) {
            case 0:
                ap apVar = this.f30160b;
                apVar.f26779b0 = (TL_stories.TL_premium_boostsStatus) obj;
                apVar.f26777a0 = true;
                apVar.F(true);
                apVar.Z = false;
                break;
            default:
                ap.m(this.f30160b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
