package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class cb1 implements Utilities.Callback {
    public final int f35920a;
    public final mc1 f35921b;

    public cb1(mc1 mc1Var, int i10) {
        this.f35920a = i10;
        this.f35921b = mc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35920a) {
            case 0:
                mc1 mc1Var = this.f35921b;
                mc1Var.getClass();
                mc1Var.f39161n1 = ((Float) obj).floatValue();
                mc1Var.f39184x0.invalidate();
                mc1Var.V0();
                return;
            case 1:
                mc1 mc1Var2 = this.f35921b;
                mc1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                mc1Var2.U1 = true;
                mc1Var2.h1(true);
                mc1Var2.T1 = false;
                return;
            default:
                mc1.U(this.f35921b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
