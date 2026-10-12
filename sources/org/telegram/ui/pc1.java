package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class pc1 implements Utilities.Callback {
    public final int f40919a;
    public final zd1 f40920b;

    public pc1(zd1 zd1Var, int i10) {
        this.f40919a = i10;
        this.f40920b = zd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40919a) {
            case 0:
                zd1 zd1Var = this.f40920b;
                zd1Var.getClass();
                zd1Var.f44769n1 = ((Float) obj).floatValue();
                zd1Var.f44792x0.invalidate();
                zd1Var.V0();
                return;
            case 1:
                zd1 zd1Var2 = this.f40920b;
                zd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                zd1Var2.U1 = true;
                zd1Var2.h1(true);
                zd1Var2.T1 = false;
                return;
            default:
                zd1.U(this.f40920b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
