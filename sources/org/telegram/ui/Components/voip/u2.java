package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31756a;
    public final w2 f31757b;

    public u2(w2 w2Var, int i10) {
        this.f31756a = i10;
        this.f31757b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31756a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var = this.f31757b;
                w2Var.f31785n = floatValue;
                w2Var.f31782k.invalidate();
                if (w2Var.f31785n > 1.0f && w2Var.f31789r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.i0.L(12), 0);
                    w2Var.f31789r = ofInt;
                    ofInt.addUpdateListener(new u2(w2Var, 2));
                    w2Var.f31789r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    w2Var.f31789r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2 w2Var2 = this.f31757b;
                w2Var2.f31784m = intValue;
                w2Var2.f31782k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2 w2Var3 = this.f31757b;
                if (w2Var3.f31780i <= w2Var3.f31786o / 2) {
                    intValue2 = -intValue2;
                }
                w2Var3.f31787p = intValue2;
                w2Var3.f31782k.invalidate();
                return;
        }
    }
}
