package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27447a;
    public final j3 f27448b;

    public c3(j3 j3Var, int i3) {
        this.f27447a = i3;
        this.f27448b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27447a) {
            case 0:
                j3 j3Var = this.f27448b;
                j3Var.getClass();
                j3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                return;
            case 1:
                j3 j3Var2 = this.f27448b;
                j3Var2.getClass();
                j3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                j3 j3Var3 = this.f27448b;
                j3Var3.getClass();
                j3Var3.f27660e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var3.invalidate();
                return;
        }
    }
}
