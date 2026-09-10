package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18611a;
    public final h3 f18612b;

    public r2(h3 h3Var, int i10) {
        this.f18611a = i10;
        this.f18612b = h3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18611a) {
            case 0:
                h3 h3Var = this.f18612b;
                h3Var.getClass();
                h3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = h3Var.container;
                if (f3Var != null) {
                    f3Var.invalidate();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f18612b;
                h3Var2.getClass();
                h3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var2 = h3Var2.container;
                if (f3Var2 != null) {
                    f3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f18612b.onContainerViewTranslation();
                return;
            case 3:
                this.f18612b.onContainerViewTranslation();
                return;
            case 4:
                this.f18612b.onContainerViewTranslation();
                return;
            case 5:
                h3.j(this.f18612b, valueAnimator);
                return;
            case 6:
                this.f18612b.onContainerViewTranslation();
                return;
            default:
                h3.i(this.f18612b, valueAnimator);
                return;
        }
    }
}
