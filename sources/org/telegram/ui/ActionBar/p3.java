package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22223a;
    public final x3 f22224b;

    public p3(x3 x3Var, int i10) {
        this.f22223a = i10;
        this.f22224b = x3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22223a) {
            case 0:
                x3 x3Var = this.f22224b;
                x3Var.getClass();
                x3Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.invalidate();
                return;
            case 1:
                x3 x3Var2 = this.f22224b;
                x3Var2.getClass();
                x3Var2.f22412e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.invalidate();
                return;
            default:
                x3 x3Var3 = this.f22224b;
                x3Var3.getClass();
                x3Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
