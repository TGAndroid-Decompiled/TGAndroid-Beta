package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ng0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28773a;
    public final pg0 f28774b;

    public ng0(pg0 pg0Var, int i10) {
        this.f28773a = i10;
        this.f28774b = pg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28773a) {
            case 0:
                pg0 pg0Var = this.f28774b;
                pg0Var.getClass();
                pg0Var.f29268y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var.invalidate();
                return;
            default:
                pg0 pg0Var2 = this.f28774b;
                pg0Var2.getClass();
                pg0Var2.f29268y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var2.invalidate();
                return;
        }
    }
}
