package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ec1 implements Utilities.Callback {
    public final int f33368a;
    public final od1 f33369b;

    public ec1(od1 od1Var, int i10) {
        this.f33368a = i10;
        this.f33369b = od1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33368a) {
            case 0:
                od1 od1Var = this.f33369b;
                od1Var.getClass();
                od1Var.f36191n1 = ((Float) obj).floatValue();
                od1Var.f36214x0.invalidate();
                od1Var.V0();
                return;
            case 1:
                od1 od1Var2 = this.f33369b;
                od1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                od1Var2.U1 = true;
                od1Var2.h1(true);
                od1Var2.T1 = false;
                return;
            default:
                od1.U(this.f33369b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
