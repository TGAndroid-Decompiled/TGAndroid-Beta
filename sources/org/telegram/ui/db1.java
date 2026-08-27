package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class db1 implements d5.d {

    public final int f37346a;

    public final nc1 f37347b;

    public db1(nc1 nc1Var, int i10) {
        this.f37346a = i10;
        this.f37347b = nc1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37346a) {
            case 0:
                nc1 nc1Var = this.f37347b;
                nc1Var.R1 = (TL_stories.TL_premium_boostsStatus) obj;
                nc1Var.Q1 = true;
                nc1Var.h1(true);
                nc1Var.P1 = false;
                break;
            default:
                nc1.X(this.f37347b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
