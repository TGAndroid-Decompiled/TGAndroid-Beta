package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21786a;
    public final h3 f21787b;

    public q2(h3 h3Var, int i10) {
        this.f21786a = i10;
        this.f21787b = h3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21786a) {
            case 0:
                h3 h3Var = this.f21787b;
                h3Var.getClass();
                h3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var = h3Var.container;
                if (e3Var != null) {
                    e3Var.invalidate();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f21787b;
                h3Var2.getClass();
                h3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var2 = h3Var2.container;
                if (e3Var2 != null) {
                    e3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f21787b.onContainerViewTranslation();
                return;
            case 3:
                this.f21787b.onContainerViewTranslation();
                return;
            case 4:
                this.f21787b.onContainerViewTranslation();
                return;
            case 5:
                h3.j(this.f21787b, valueAnimator);
                return;
            case 6:
                this.f21787b.onContainerViewTranslation();
                return;
            default:
                h3.i(this.f21787b, valueAnimator);
                return;
        }
    }
}
