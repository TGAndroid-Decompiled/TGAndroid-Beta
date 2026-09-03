package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22225a;
    public final x3 f22226b;

    public p3(x3 x3Var, int i10) {
        this.f22225a = i10;
        this.f22226b = x3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22225a) {
            case 0:
                x3 x3Var = this.f22226b;
                x3Var.getClass();
                x3Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.invalidate();
                return;
            case 1:
                x3 x3Var2 = this.f22226b;
                x3Var2.getClass();
                x3Var2.f22414e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.invalidate();
                return;
            default:
                x3 x3Var3 = this.f22226b;
                x3Var3.getClass();
                x3Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
