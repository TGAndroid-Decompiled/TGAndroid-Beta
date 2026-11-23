package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40923a;
    public final j3 f40924b;

    public h3(j3 j3Var, int i7) {
        this.f40923a = i7;
        this.f40924b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40923a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3 j3Var = this.f40924b;
                j3Var.f40971n = floatValue;
                j3Var.f40968k.invalidate();
                if (j3Var.f40971n > 1.0f && j3Var.f40975r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    j3Var.f40975r = ofInt;
                    ofInt.addUpdateListener(new h3(j3Var, 2));
                    j3Var.f40975r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    j3Var.f40975r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var2 = this.f40924b;
                j3Var2.f40970m = intValue;
                j3Var2.f40968k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var3 = this.f40924b;
                if (j3Var3.f40966i <= j3Var3.f40972o / 2) {
                    intValue2 = -intValue2;
                }
                j3Var3.f40973p = intValue2;
                j3Var3.f40968k.invalidate();
                return;
        }
    }
}
