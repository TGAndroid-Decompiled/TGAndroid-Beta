package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ch0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23272a;
    public final fh0 f23273b;

    public ch0(fh0 fh0Var, int i10) {
        this.f23272a = i10;
        this.f23273b = fh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23272a) {
            case 0:
                fh0 fh0Var = this.f23273b;
                fh0Var.getClass();
                fh0Var.f24162b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fh0Var.c(true);
                return;
            default:
                fh0 fh0Var2 = this.f23273b;
                fh0Var2.getClass();
                fh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fh0Var2.c(true);
                return;
        }
    }
}
