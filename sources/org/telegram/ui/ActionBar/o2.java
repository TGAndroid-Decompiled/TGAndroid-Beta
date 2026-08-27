package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class o2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f23696a;

    public final e3 f23697b;

    public o2(e3 e3Var, int i10) {
        this.f23696a = i10;
        this.f23697b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23696a) {
            case 0:
                e3 e3Var = this.f23697b;
                e3Var.getClass();
                e3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3 c3Var = e3Var.container;
                if (c3Var != null) {
                    c3Var.invalidate();
                }
                break;
            case 1:
                e3 e3Var2 = this.f23697b;
                e3Var2.getClass();
                e3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3 c3Var2 = e3Var2.container;
                if (c3Var2 != null) {
                    c3Var2.invalidate();
                }
                break;
            case 2:
                this.f23697b.onContainerViewTranslation();
                break;
            case 3:
                this.f23697b.onContainerViewTranslation();
                break;
            case 4:
                this.f23697b.onContainerViewTranslation();
                break;
            case 5:
                e3.j(this.f23697b, valueAnimator);
                break;
            case 6:
                this.f23697b.onContainerViewTranslation();
                break;
            default:
                e3.i(this.f23697b, valueAnimator);
                break;
        }
    }
}
