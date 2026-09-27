package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ec1 implements Utilities.Callback {
    public final int f33217a;
    public final pd1 f33218b;

    public ec1(pd1 pd1Var, int i10) {
        this.f33217a = i10;
        this.f33218b = pd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33217a) {
            case 0:
                pd1 pd1Var = this.f33218b;
                pd1Var.getClass();
                pd1Var.f36429n1 = ((Float) obj).floatValue();
                pd1Var.f36452x0.invalidate();
                pd1Var.V0();
                return;
            case 1:
                pd1 pd1Var2 = this.f33218b;
                pd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                pd1Var2.U1 = true;
                pd1Var2.h1(true);
                pd1Var2.T1 = false;
                return;
            default:
                pd1.U(this.f33218b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
