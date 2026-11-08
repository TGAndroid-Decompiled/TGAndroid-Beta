package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27450a;
    public final k3 f27451b;

    public e3(k3 k3Var, int i7) {
        this.f27450a = i7;
        this.f27451b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27450a) {
            case 0:
                k3 k3Var = this.f27451b;
                k3Var.getClass();
                k3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                return;
            case 1:
                k3 k3Var2 = this.f27451b;
                k3Var2.getClass();
                k3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                k3 k3Var3 = this.f27451b;
                k3Var3.getClass();
                k3Var3.f27722e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var3.invalidate();
                return;
        }
    }
}
