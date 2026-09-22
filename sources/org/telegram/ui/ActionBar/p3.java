package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19735a;
    public final x3 f19736b;

    public p3(x3 x3Var, int i10) {
        this.f19735a = i10;
        this.f19736b = x3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19735a) {
            case 0:
                x3 x3Var = this.f19736b;
                x3Var.getClass();
                x3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.invalidate();
                return;
            case 1:
                x3 x3Var2 = this.f19736b;
                x3Var2.getClass();
                x3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.invalidate();
                return;
            default:
                x3 x3Var3 = this.f19736b;
                x3Var3.getClass();
                x3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
