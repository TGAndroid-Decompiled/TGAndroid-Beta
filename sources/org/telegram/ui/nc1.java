package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class nc1 implements Utilities.Callback {
    public final int f40171a;
    public final xd1 f40172b;

    public nc1(xd1 xd1Var, int i10) {
        this.f40171a = i10;
        this.f40172b = xd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40171a) {
            case 0:
                xd1 xd1Var = this.f40172b;
                xd1Var.getClass();
                xd1Var.f43977n1 = ((Float) obj).floatValue();
                xd1Var.f44000x0.invalidate();
                xd1Var.V0();
                return;
            case 1:
                xd1 xd1Var2 = this.f40172b;
                xd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var2.U1 = true;
                xd1Var2.h1(true);
                xd1Var2.T1 = false;
                return;
            default:
                xd1.U(this.f40172b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
