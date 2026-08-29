package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class gb1 implements f5.d {
    public final int f38549a;
    public final qc1 f38550b;

    public gb1(qc1 qc1Var, int i10) {
        this.f38549a = i10;
        this.f38550b = qc1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38549a) {
            case 0:
                qc1 qc1Var = this.f38550b;
                qc1Var.R1 = (TL_stories.TL_premium_boostsStatus) obj;
                qc1Var.Q1 = true;
                qc1Var.h1(true);
                qc1Var.P1 = false;
                return;
            default:
                qc1.X(this.f38550b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
