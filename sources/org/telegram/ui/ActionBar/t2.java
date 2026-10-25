package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23093a;
    public final k3 f23094b;

    public t2(k3 k3Var, int i10) {
        this.f23093a = i10;
        this.f23094b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23093a) {
            case 0:
                k3 k3Var = this.f23094b;
                k3Var.getClass();
                k3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var = k3Var.container;
                if (h3Var != null) {
                    h3Var.invalidate();
                    return;
                }
                return;
            case 1:
                k3 k3Var2 = this.f23094b;
                k3Var2.getClass();
                k3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var2 = k3Var2.container;
                if (h3Var2 != null) {
                    h3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f23094b.onContainerViewTranslation();
                return;
            case 3:
                this.f23094b.onContainerViewTranslation();
                return;
            case 4:
                this.f23094b.onContainerViewTranslation();
                return;
            case 5:
                k3.j(this.f23094b, valueAnimator);
                return;
            case 6:
                this.f23094b.onContainerViewTranslation();
                return;
            default:
                k3.i(this.f23094b, valueAnimator);
                return;
        }
    }
}
