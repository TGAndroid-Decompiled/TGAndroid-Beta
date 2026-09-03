package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22238a;
    public final h3 f22239b;

    public q2(h3 h3Var, int i10) {
        this.f22238a = i10;
        this.f22239b = h3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22238a) {
            case 0:
                h3 h3Var = this.f22239b;
                h3Var.getClass();
                h3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = h3Var.container;
                if (f3Var != null) {
                    f3Var.invalidate();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f22239b;
                h3Var2.getClass();
                h3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var2 = h3Var2.container;
                if (f3Var2 != null) {
                    f3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f22239b.onContainerViewTranslation();
                return;
            case 3:
                this.f22239b.onContainerViewTranslation();
                return;
            case 4:
                this.f22239b.onContainerViewTranslation();
                return;
            case 5:
                h3.j(this.f22239b, valueAnimator);
                return;
            case 6:
                this.f22239b.onContainerViewTranslation();
                return;
            default:
                h3.i(this.f22239b, valueAnimator);
                return;
        }
    }
}
