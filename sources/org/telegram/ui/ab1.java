package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ab1 implements Utilities.Callback {
    public final int f35329a;
    public final kc1 f35330b;

    public ab1(kc1 kc1Var, int i10) {
        this.f35329a = i10;
        this.f35330b = kc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35329a) {
            case 0:
                kc1 kc1Var = this.f35330b;
                kc1Var.getClass();
                kc1Var.f38548n1 = ((Float) obj).floatValue();
                kc1Var.f38571x0.invalidate();
                kc1Var.V0();
                return;
            case 1:
                kc1 kc1Var2 = this.f35330b;
                kc1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                kc1Var2.U1 = true;
                kc1Var2.h1(true);
                kc1Var2.T1 = false;
                return;
            default:
                kc1.U(this.f35330b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
