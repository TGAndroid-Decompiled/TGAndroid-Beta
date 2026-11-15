package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40647a;
    public final j3 f40648b;

    public h3(j3 j3Var, int i7) {
        this.f40647a = i7;
        this.f40648b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40647a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3 j3Var = this.f40648b;
                j3Var.f40695n = floatValue;
                j3Var.f40692k.invalidate();
                if (j3Var.f40695n > 1.0f && j3Var.f40699r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    j3Var.f40699r = ofInt;
                    ofInt.addUpdateListener(new h3(j3Var, 2));
                    j3Var.f40699r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    j3Var.f40699r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var2 = this.f40648b;
                j3Var2.f40694m = intValue;
                j3Var2.f40692k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var3 = this.f40648b;
                if (j3Var3.f40690i <= j3Var3.f40696o / 2) {
                    intValue2 = -intValue2;
                }
                j3Var3.f40697p = intValue2;
                j3Var3.f40692k.invalidate();
                return;
        }
    }
}
