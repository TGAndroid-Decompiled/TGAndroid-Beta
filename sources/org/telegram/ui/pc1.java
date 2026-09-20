package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class pc1 implements e2.h {
    public final int f36538a;
    public final xd1 f36539b;

    public pc1(xd1 xd1Var, int i10) {
        this.f36538a = i10;
        this.f36539b = xd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36538a) {
            case 0:
                xd1 xd1Var = this.f36539b;
                xd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var.U1 = true;
                xd1Var.h1(true);
                xd1Var.T1 = false;
                return;
            default:
                xd1.V(this.f36539b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
