package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ph0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31564a;
    public final sh0 f31565b;

    public ph0(sh0 sh0Var, int i10) {
        this.f31564a = i10;
        this.f31565b = sh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31564a) {
            case 0:
                sh0 sh0Var = this.f31565b;
                sh0Var.getClass();
                sh0Var.f32557b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sh0Var.c(true);
                return;
            default:
                sh0 sh0Var2 = this.f31565b;
                sh0Var2.getClass();
                sh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sh0Var2.c(true);
                return;
        }
    }
}
