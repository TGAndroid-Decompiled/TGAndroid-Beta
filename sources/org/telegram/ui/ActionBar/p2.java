package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23703a;
    public final f3 f23704b;

    public p2(f3 f3Var, int i9) {
        this.f23703a = i9;
        this.f23704b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23703a) {
            case 0:
                f3 f3Var = this.f23704b;
                f3Var.getClass();
                f3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3 d3Var = f3Var.container;
                if (d3Var != null) {
                    d3Var.invalidate();
                    return;
                }
                return;
            case 1:
                f3 f3Var2 = this.f23704b;
                f3Var2.getClass();
                f3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3 d3Var2 = f3Var2.container;
                if (d3Var2 != null) {
                    d3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f23704b.onContainerViewTranslation();
                return;
            case 3:
                this.f23704b.onContainerViewTranslation();
                return;
            case 4:
                this.f23704b.onContainerViewTranslation();
                return;
            case 5:
                f3.j(this.f23704b, valueAnimator);
                return;
            case 6:
                this.f23704b.onContainerViewTranslation();
                return;
            default:
                f3.i(this.f23704b, valueAnimator);
                return;
        }
    }
}
