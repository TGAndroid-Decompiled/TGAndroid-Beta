package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class cb1 implements Utilities.Callback {
    public final int f35907a;
    public final mc1 f35908b;

    public cb1(mc1 mc1Var, int i10) {
        this.f35907a = i10;
        this.f35908b = mc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35907a) {
            case 0:
                mc1 mc1Var = this.f35908b;
                mc1Var.getClass();
                mc1Var.f39136n1 = ((Float) obj).floatValue();
                mc1Var.f39159x0.invalidate();
                mc1Var.V0();
                return;
            case 1:
                mc1 mc1Var2 = this.f35908b;
                mc1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                mc1Var2.U1 = true;
                mc1Var2.h1(true);
                mc1Var2.T1 = false;
                return;
            default:
                mc1.U(this.f35908b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
