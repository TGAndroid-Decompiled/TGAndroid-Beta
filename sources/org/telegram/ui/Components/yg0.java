package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33102a;
    public final ah0 f33103b;

    public yg0(ah0 ah0Var, int i10) {
        this.f33102a = i10;
        this.f33103b = ah0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33102a) {
            case 0:
                ah0 ah0Var = this.f33103b;
                ah0Var.getClass();
                ah0Var.f24319y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var.invalidate();
                return;
            default:
                ah0 ah0Var2 = this.f33103b;
                ah0Var2.getClass();
                ah0Var2.f24319y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var2.invalidate();
                return;
        }
    }
}
