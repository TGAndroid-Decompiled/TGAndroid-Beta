package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ib1 implements Utilities.Callback {
    public final int f40203a;
    public final tc1 f40204b;

    public ib1(tc1 tc1Var, int i10) {
        this.f40203a = i10;
        this.f40204b = tc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40203a) {
            case 0:
                tc1 tc1Var = this.f40204b;
                tc1Var.getClass();
                tc1Var.f43775o1 = ((Float) obj).floatValue();
                tc1Var.f43799y0.invalidate();
                tc1Var.W0();
                return;
            case 1:
                tc1 tc1Var2 = this.f40204b;
                tc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                tc1Var2.V1 = true;
                tc1Var2.i1(true);
                tc1Var2.U1 = false;
                return;
            default:
                tc1.V(this.f40204b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
