package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class fc1 implements Utilities.Callback {
    public final int f36268a;
    public final pd1 f36269b;

    public fc1(pd1 pd1Var, int i10) {
        this.f36268a = i10;
        this.f36269b = pd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36268a) {
            case 0:
                pd1 pd1Var = this.f36269b;
                pd1Var.getClass();
                pd1Var.f39527n1 = ((Float) obj).floatValue();
                pd1Var.f39550x0.invalidate();
                pd1Var.V0();
                return;
            case 1:
                pd1 pd1Var2 = this.f36269b;
                pd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                pd1Var2.U1 = true;
                pd1Var2.h1(true);
                pd1Var2.T1 = false;
                return;
            default:
                pd1.S(this.f36269b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
