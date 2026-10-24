package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class fb1 implements Utilities.Callback {
    public final int f37292a;
    public final pc1 f37293b;

    public fb1(pc1 pc1Var, int i10) {
        this.f37292a = i10;
        this.f37293b = pc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37292a) {
            case 0:
                pc1 pc1Var = this.f37293b;
                pc1Var.getClass();
                pc1Var.f40484o1 = ((Float) obj).floatValue();
                pc1Var.f40508y0.invalidate();
                pc1Var.V0();
                return;
            case 1:
                pc1 pc1Var2 = this.f37293b;
                pc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                pc1Var2.V1 = true;
                pc1Var2.h1(true);
                pc1Var2.U1 = false;
                return;
            default:
                pc1.U(this.f37293b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
