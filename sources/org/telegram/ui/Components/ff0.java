package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ff0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35075a;
    public final if0 f35076b;

    public ff0(if0 if0Var, int i7) {
        this.f35075a = i7;
        this.f35076b = if0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35075a) {
            case 0:
                if0 if0Var = this.f35076b;
                if0Var.getClass();
                if0Var.f36113b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var.c(true);
                return;
            default:
                if0 if0Var2 = this.f35076b;
                if0Var2.getClass();
                if0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var2.c(true);
                return;
        }
    }
}
