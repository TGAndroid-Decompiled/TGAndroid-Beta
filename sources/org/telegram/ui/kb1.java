package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class kb1 implements Utilities.Callback {
    public final int f40727a;
    public final vc1 f40728b;

    public kb1(vc1 vc1Var, int i10) {
        this.f40727a = i10;
        this.f40728b = vc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40727a) {
            case 0:
                vc1 vc1Var = this.f40728b;
                vc1Var.getClass();
                vc1Var.f44288o1 = ((Float) obj).floatValue();
                vc1Var.f44312y0.invalidate();
                vc1Var.W0();
                return;
            case 1:
                vc1 vc1Var2 = this.f40728b;
                vc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                vc1Var2.V1 = true;
                vc1Var2.i1(true);
                vc1Var2.U1 = false;
                return;
            default:
                vc1.V(this.f40728b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
