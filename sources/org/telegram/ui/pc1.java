package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class pc1 implements Utilities.Callback {
    public final int f40921a;
    public final zd1 f40922b;

    public pc1(zd1 zd1Var, int i10) {
        this.f40921a = i10;
        this.f40922b = zd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40921a) {
            case 0:
                zd1 zd1Var = this.f40922b;
                zd1Var.getClass();
                zd1Var.f44774n1 = ((Float) obj).floatValue();
                zd1Var.f44797x0.invalidate();
                zd1Var.V0();
                return;
            case 1:
                zd1 zd1Var2 = this.f40922b;
                zd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                zd1Var2.U1 = true;
                zd1Var2.h1(true);
                zd1Var2.T1 = false;
                return;
            default:
                zd1.U(this.f40922b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
