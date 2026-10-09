package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29001a;
    public final o10 f29002b;

    public n10(o10 o10Var, int i10) {
        this.f29001a = i10;
        this.f29002b = o10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29001a) {
            case 0:
                o10 o10Var = this.f29002b;
                o10Var.getClass();
                o10Var.f29338x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o10Var.invalidate();
                return;
            case 1:
                o10 o10Var2 = this.f29002b;
                o10Var2.getClass();
                o10Var2.f29336s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                o10Var2.invalidate();
                return;
            default:
                o10 o10Var3 = this.f29002b;
                o10Var3.getClass();
                o10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o10Var3.invalidate();
                return;
        }
    }
}
