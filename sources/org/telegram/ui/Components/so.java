package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class so implements h5.d {
    public final int f28785a;
    public final kp f28786b;

    public so(kp kpVar, int i10) {
        this.f28785a = i10;
        this.f28786b = kpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28785a) {
            case 0:
                kp kpVar = this.f28786b;
                kpVar.f26340c0 = (TL_stories.TL_premium_boostsStatus) obj;
                kpVar.f26338b0 = true;
                kpVar.E(true);
                kpVar.f26336a0 = false;
                return;
            default:
                kp.m(this.f28786b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
