package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class bc1 implements h5.d {
    public final int f32838a;
    public final jd1 f32839b;

    public bc1(jd1 jd1Var, int i10) {
        this.f32838a = i10;
        this.f32839b = jd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32838a) {
            case 0:
                jd1 jd1Var = this.f32839b;
                jd1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                jd1Var.R1 = true;
                jd1Var.h1(true);
                jd1Var.Q1 = false;
                return;
            default:
                jd1.X(this.f32839b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
