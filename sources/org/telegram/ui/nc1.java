package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class nc1 implements e2.h {
    public final int f35901a;
    public final vd1 f35902b;

    public nc1(vd1 vd1Var, int i10) {
        this.f35901a = i10;
        this.f35902b = vd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35901a) {
            case 0:
                vd1 vd1Var = this.f35902b;
                vd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                vd1Var.U1 = true;
                vd1Var.h1(true);
                vd1Var.T1 = false;
                return;
            default:
                vd1.V(this.f35902b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
