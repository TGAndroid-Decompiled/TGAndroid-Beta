package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class oc1 implements e2.h {
    public final int f39243a;
    public final wd1 f39244b;

    public oc1(wd1 wd1Var, int i10) {
        this.f39243a = i10;
        this.f39244b = wd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39243a) {
            case 0:
                wd1 wd1Var = this.f39244b;
                wd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                wd1Var.U1 = true;
                wd1Var.h1(true);
                wd1Var.T1 = false;
                return;
            default:
                wd1.V(this.f39244b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
