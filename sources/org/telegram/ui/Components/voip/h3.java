package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40644a;
    public final j3 f40645b;

    public h3(j3 j3Var, int i7) {
        this.f40644a = i7;
        this.f40645b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40644a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3 j3Var = this.f40645b;
                j3Var.f40692n = floatValue;
                j3Var.f40689k.invalidate();
                if (j3Var.f40692n > 1.0f && j3Var.f40696r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    j3Var.f40696r = ofInt;
                    ofInt.addUpdateListener(new h3(j3Var, 2));
                    j3Var.f40696r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    j3Var.f40696r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var2 = this.f40645b;
                j3Var2.f40691m = intValue;
                j3Var2.f40689k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var3 = this.f40645b;
                if (j3Var3.f40687i <= j3Var3.f40693o / 2) {
                    intValue2 = -intValue2;
                }
                j3Var3.f40694p = intValue2;
                j3Var3.f40689k.invalidate();
                return;
        }
    }
}
