package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class hc1 implements Utilities.Callback {
    public final int f37040a;
    public final rd1 f37041b;

    public hc1(rd1 rd1Var, int i10) {
        this.f37040a = i10;
        this.f37041b = rd1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37040a) {
            case 0:
                rd1 rd1Var = this.f37041b;
                rd1Var.getClass();
                rd1Var.f40077n1 = ((Float) obj).floatValue();
                rd1Var.f40100x0.invalidate();
                rd1Var.V0();
                return;
            case 1:
                rd1 rd1Var2 = this.f37041b;
                rd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                rd1Var2.U1 = true;
                rd1Var2.h1(true);
                rd1Var2.T1 = false;
                return;
            default:
                rd1.S(this.f37041b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
