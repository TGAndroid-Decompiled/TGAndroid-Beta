package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27474a;
    public final ef0 f27475b;

    public cf0(ef0 ef0Var, int i9) {
        this.f27474a = i9;
        this.f27475b = ef0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27474a) {
            case 0:
                ef0 ef0Var = this.f27475b;
                ef0Var.getClass();
                ef0Var.f28022y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ef0Var.invalidate();
                return;
            default:
                ef0 ef0Var2 = this.f27475b;
                ef0Var2.getClass();
                ef0Var2.f28022y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ef0Var2.invalidate();
                return;
        }
    }
}
