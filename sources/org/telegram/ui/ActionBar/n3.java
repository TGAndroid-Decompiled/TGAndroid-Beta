package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20547a;
    public final v3 f20548b;

    public n3(v3 v3Var, int i10) {
        this.f20547a = i10;
        this.f20548b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20547a) {
            case 0:
                v3 v3Var = this.f20548b;
                v3Var.getClass();
                v3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                return;
            case 1:
                v3 v3Var2 = this.f20548b;
                v3Var2.getClass();
                v3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.invalidate();
                return;
            default:
                v3 v3Var3 = this.f20548b;
                v3Var3.getClass();
                v3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
