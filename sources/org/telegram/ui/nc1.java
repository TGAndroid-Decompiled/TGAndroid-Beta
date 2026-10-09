package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class nc1 implements Utilities.Callback {
    public final int f40169a;
    public final xd1 f40170b;

    public nc1(xd1 xd1Var, int i10) {
        this.f40169a = i10;
        this.f40170b = xd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40169a) {
            case 0:
                xd1 xd1Var = this.f40170b;
                xd1Var.getClass();
                xd1Var.f43975n1 = ((Float) obj).floatValue();
                xd1Var.f43998x0.invalidate();
                xd1Var.V0();
                return;
            case 1:
                xd1 xd1Var2 = this.f40170b;
                xd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var2.U1 = true;
                xd1Var2.h1(true);
                xd1Var2.T1 = false;
                return;
            default:
                xd1.U(this.f40170b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
