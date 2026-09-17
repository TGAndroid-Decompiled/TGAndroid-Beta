package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class pc1 implements e2.h {
    public final int f36599a;
    public final xd1 f36600b;

    public pc1(xd1 xd1Var, int i10) {
        this.f36599a = i10;
        this.f36600b = xd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36599a) {
            case 0:
                xd1 xd1Var = this.f36600b;
                xd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var.U1 = true;
                xd1Var.h1(true);
                xd1Var.T1 = false;
                return;
            default:
                xd1.V(this.f36600b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
