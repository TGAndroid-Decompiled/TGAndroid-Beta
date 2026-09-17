package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19526a;
    public final g3 f19527b;

    public q2(g3 g3Var, int i10) {
        this.f19526a = i10;
        this.f19527b = g3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19526a) {
            case 0:
                g3 g3Var = this.f19527b;
                g3Var.getClass();
                g3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var = g3Var.container;
                if (e3Var != null) {
                    e3Var.invalidate();
                    return;
                }
                return;
            case 1:
                g3 g3Var2 = this.f19527b;
                g3Var2.getClass();
                g3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var2 = g3Var2.container;
                if (e3Var2 != null) {
                    e3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f19527b.onContainerViewTranslation();
                return;
            case 3:
                this.f19527b.onContainerViewTranslation();
                return;
            case 4:
                this.f19527b.onContainerViewTranslation();
                return;
            case 5:
                g3.j(this.f19527b, valueAnimator);
                return;
            case 6:
                this.f19527b.onContainerViewTranslation();
                return;
            default:
                g3.i(this.f19527b, valueAnimator);
                return;
        }
    }
}
