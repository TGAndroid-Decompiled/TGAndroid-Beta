package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28142a;
    public final j3 f28143b;

    public g3(j3 j3Var, int i10) {
        this.f28142a = i10;
        this.f28143b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28142a) {
            case 0:
                j3 j3Var = this.f28143b;
                j3Var.getClass();
                j3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                return;
            case 1:
                j3 j3Var2 = this.f28143b;
                j3Var2.getClass();
                j3Var2.f28202w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var2.invalidate();
                return;
            case 2:
                j3 j3Var3 = this.f28143b;
                j3Var3.getClass();
                j3Var3.f28201s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var3.invalidate();
                return;
            default:
                j3 j3Var4 = this.f28143b;
                j3Var4.getClass();
                j3Var4.f28200r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var4.invalidate();
                return;
        }
    }
}
