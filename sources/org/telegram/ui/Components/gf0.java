package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class gf0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f28614a;

    public final if0 f28615b;

    public gf0(if0 if0Var, int i10) {
        this.f28614a = i10;
        this.f28615b = if0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28614a) {
            case 0:
                if0 if0Var = this.f28615b;
                if0Var.getClass();
                if0Var.f29358y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var.invalidate();
                break;
            default:
                if0 if0Var2 = this.f28615b;
                if0Var2.getClass();
                if0Var2.f29358y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var2.invalidate();
                break;
        }
    }
}
