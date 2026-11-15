package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28503a;
    public final j3 f28504b;

    public d3(j3 j3Var, int i7) {
        this.f28503a = i7;
        this.f28504b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28503a) {
            case 0:
                j3 j3Var = this.f28504b;
                j3Var.getClass();
                j3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                return;
            case 1:
                j3 j3Var2 = this.f28504b;
                j3Var2.getClass();
                j3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                j3 j3Var3 = this.f28504b;
                j3Var3.getClass();
                j3Var3.f28732e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var3.invalidate();
                return;
        }
    }
}
