package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27470a;
    public final l3 f27471b;

    public f3(l3 l3Var, int i7) {
        this.f27470a = i7;
        this.f27471b = l3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27470a) {
            case 0:
                l3 l3Var = this.f27471b;
                l3Var.getClass();
                l3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.invalidate();
                return;
            case 1:
                l3 l3Var2 = this.f27471b;
                l3Var2.getClass();
                l3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                l3 l3Var3 = this.f27471b;
                l3Var3.getClass();
                l3Var3.f27735e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var3.invalidate();
                return;
        }
    }
}
