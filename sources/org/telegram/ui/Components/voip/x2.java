package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39712a;
    public final a3 f39713b;

    public x2(a3 a3Var, int i7) {
        this.f39712a = i7;
        this.f39713b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39712a) {
            case 0:
                a3 a3Var = this.f39713b;
                a3Var.getClass();
                a3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                return;
            case 1:
                a3 a3Var2 = this.f39713b;
                a3Var2.getClass();
                a3Var2.f39195x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var2.invalidate();
                return;
            case 2:
                a3 a3Var3 = this.f39713b;
                a3Var3.getClass();
                a3Var3.f39193s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var3.invalidate();
                return;
            default:
                a3 a3Var4 = this.f39713b;
                a3Var4.getClass();
                a3Var4.f39192r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var4.invalidate();
                return;
        }
    }
}
