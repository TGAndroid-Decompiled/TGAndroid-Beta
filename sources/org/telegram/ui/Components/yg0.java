package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33101a;
    public final ah0 f33102b;

    public yg0(ah0 ah0Var, int i10) {
        this.f33101a = i10;
        this.f33102b = ah0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33101a) {
            case 0:
                ah0 ah0Var = this.f33102b;
                ah0Var.getClass();
                ah0Var.f24315y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var.invalidate();
                return;
            default:
                ah0 ah0Var2 = this.f33102b;
                ah0Var2.getClass();
                ah0Var2.f24315y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var2.invalidate();
                return;
        }
    }
}
