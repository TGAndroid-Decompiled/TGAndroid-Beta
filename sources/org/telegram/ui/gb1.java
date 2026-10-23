package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gb1 implements Utilities.Callback {
    public final int f37563a;
    public final qc1 f37564b;

    public gb1(qc1 qc1Var, int i10) {
        this.f37563a = i10;
        this.f37564b = qc1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37563a) {
            case 0:
                qc1 qc1Var = this.f37564b;
                qc1Var.getClass();
                qc1Var.f40755o1 = ((Float) obj).floatValue();
                qc1Var.f40779y0.invalidate();
                qc1Var.V0();
                return;
            case 1:
                qc1 qc1Var2 = this.f37564b;
                qc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                qc1Var2.V1 = true;
                qc1Var2.h1(true);
                qc1Var2.U1 = false;
                return;
            default:
                qc1.U(this.f37564b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
