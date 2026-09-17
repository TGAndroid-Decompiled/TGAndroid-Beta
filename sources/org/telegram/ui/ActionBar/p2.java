package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21296a;
    public final f3 f21297b;

    public p2(f3 f3Var, int i10) {
        this.f21296a = i10;
        this.f21297b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21296a) {
            case 0:
                f3 f3Var = this.f21297b;
                f3Var.getClass();
                f3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3 d3Var = f3Var.container;
                if (d3Var != null) {
                    d3Var.invalidate();
                    return;
                }
                return;
            case 1:
                f3 f3Var2 = this.f21297b;
                f3Var2.getClass();
                f3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3 d3Var2 = f3Var2.container;
                if (d3Var2 != null) {
                    d3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                this.f21297b.onContainerViewTranslation();
                return;
            case 3:
                this.f21297b.onContainerViewTranslation();
                return;
            case 4:
                this.f21297b.onContainerViewTranslation();
                return;
            case 5:
                f3.j(this.f21297b, valueAnimator);
                return;
            case 6:
                this.f21297b.onContainerViewTranslation();
                return;
            default:
                f3.i(this.f21297b, valueAnimator);
                return;
        }
    }
}
