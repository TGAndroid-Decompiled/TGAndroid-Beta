package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21427a;
    public final e3 f21428b;

    public o2(e3 e3Var, int i10) {
        this.f21427a = i10;
        this.f21428b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21427a) {
            case 0:
                e3 e3Var = this.f21428b;
                e3Var.getClass();
                e3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3 c3Var = e3Var.container;
                if (c3Var != null) {
                    c3Var.invalidate();
                    return;
                }
                return;
            case 1:
                e3 e3Var2 = this.f21428b;
                e3Var2.getClass();
                e3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3 c3Var2 = e3Var2.container;
                if (c3Var2 != null) {
                    c3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f21428b.onContainerViewTranslation();
                return;
            case 3:
                this.f21428b.onContainerViewTranslation();
                return;
            case 4:
                this.f21428b.onContainerViewTranslation();
                return;
            case 5:
                e3.k(this.f21428b, valueAnimator);
                return;
            case 6:
                this.f21428b.onContainerViewTranslation();
                return;
            default:
                e3.j(this.f21428b, valueAnimator);
                return;
        }
    }
}
