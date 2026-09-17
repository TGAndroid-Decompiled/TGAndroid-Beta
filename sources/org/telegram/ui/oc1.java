package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class oc1 implements e2.h {
    public final int f39244a;
    public final wd1 f39245b;

    public oc1(wd1 wd1Var, int i10) {
        this.f39244a = i10;
        this.f39245b = wd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39244a) {
            case 0:
                wd1 wd1Var = this.f39245b;
                wd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                wd1Var.U1 = true;
                wd1Var.h1(true);
                wd1Var.T1 = false;
                return;
            default:
                wd1.V(this.f39245b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
