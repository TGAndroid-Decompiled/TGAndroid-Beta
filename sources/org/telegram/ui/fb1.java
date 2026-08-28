package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class fb1 implements d5.d {
    public final int f38206a;
    public final oc1 f38207b;

    public fb1(oc1 oc1Var, int i9) {
        this.f38206a = i9;
        this.f38207b = oc1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38206a) {
            case 0:
                oc1 oc1Var = this.f38207b;
                oc1Var.R1 = (TL_stories.TL_premium_boostsStatus) obj;
                oc1Var.Q1 = true;
                oc1Var.h1(true);
                oc1Var.P1 = false;
                return;
            default:
                oc1.W(this.f38207b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
