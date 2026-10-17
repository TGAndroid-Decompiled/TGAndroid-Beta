package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ng0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28757a;
    public final pg0 f28758b;

    public ng0(pg0 pg0Var, int i10) {
        this.f28757a = i10;
        this.f28758b = pg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28757a) {
            case 0:
                pg0 pg0Var = this.f28758b;
                pg0Var.getClass();
                pg0Var.f29298y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var.invalidate();
                return;
            default:
                pg0 pg0Var2 = this.f28758b;
                pg0Var2.getClass();
                pg0Var2.f29298y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var2.invalidate();
                return;
        }
    }
}
