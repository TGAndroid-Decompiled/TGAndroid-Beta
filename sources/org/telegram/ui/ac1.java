package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ac1 implements h5.d {
    public final int f35140a;
    public final jd1 f35141b;

    public ac1(jd1 jd1Var, int i10) {
        this.f35140a = i10;
        this.f35141b = jd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35140a) {
            case 0:
                jd1 jd1Var = this.f35141b;
                jd1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                jd1Var.R1 = true;
                jd1Var.h1(true);
                jd1Var.Q1 = false;
                return;
            default:
                jd1.X(this.f35141b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
