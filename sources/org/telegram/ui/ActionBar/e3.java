package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27446a;
    public final k3 f27447b;

    public e3(k3 k3Var, int i7) {
        this.f27446a = i7;
        this.f27447b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27446a) {
            case 0:
                k3 k3Var = this.f27447b;
                k3Var.getClass();
                k3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                return;
            case 1:
                k3 k3Var2 = this.f27447b;
                k3Var2.getClass();
                k3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                k3 k3Var3 = this.f27447b;
                k3Var3.getClass();
                k3Var3.f27718e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var3.invalidate();
                return;
        }
    }
}
