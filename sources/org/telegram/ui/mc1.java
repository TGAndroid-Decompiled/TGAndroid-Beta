package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class mc1 implements Utilities.Callback {
    public final int f39938a;
    public final wd1 f39939b;

    public mc1(wd1 wd1Var, int i10) {
        this.f39938a = i10;
        this.f39939b = wd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39938a) {
            case 0:
                wd1 wd1Var = this.f39939b;
                wd1Var.getClass();
                wd1Var.f43399n1 = ((Float) obj).floatValue();
                wd1Var.f43422x0.invalidate();
                wd1Var.V0();
                return;
            case 1:
                wd1 wd1Var2 = this.f39939b;
                wd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                wd1Var2.U1 = true;
                wd1Var2.h1(true);
                wd1Var2.T1 = false;
                return;
            default:
                wd1.U(this.f39939b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
