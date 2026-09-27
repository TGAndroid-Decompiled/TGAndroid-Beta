package org.telegram.ui;

import android.animation.ValueAnimator;
public final class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32520a;
    public final f41 f32521b;

    public c41(f41 f41Var, int i10) {
        this.f32520a = i10;
        this.f32521b = f41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32520a) {
            case 0:
                f41 f41Var = this.f32521b;
                f41Var.getClass();
                f41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.g();
                return;
            case 1:
                f41 f41Var2 = this.f32521b;
                f41Var2.getClass();
                f41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var2.g();
                return;
            default:
                f41 f41Var3 = this.f32521b;
                f41Var3.getClass();
                f41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var3.g();
                return;
        }
    }
}
