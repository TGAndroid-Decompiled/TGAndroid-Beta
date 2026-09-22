package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class pc1 implements e2.h {
    public final int f36565a;
    public final xd1 f36566b;

    public pc1(xd1 xd1Var, int i10) {
        this.f36565a = i10;
        this.f36566b = xd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36565a) {
            case 0:
                xd1 xd1Var = this.f36566b;
                xd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var.U1 = true;
                xd1Var.h1(true);
                xd1Var.T1 = false;
                return;
            default:
                xd1.V(this.f36566b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
