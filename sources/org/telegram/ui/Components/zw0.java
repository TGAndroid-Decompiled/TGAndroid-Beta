package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29821a;
    public final cx0 f29822b;

    public zw0(cx0 cx0Var, int i10) {
        this.f29821a = i10;
        this.f29822b = cx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29821a) {
            case 0:
                cx0 cx0Var = this.f29822b;
                cx0Var.getClass();
                cx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                return;
            case 1:
                cx0 cx0Var2 = this.f29822b;
                cx0Var2.getClass();
                cx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cx0 cx0Var3 = this.f29822b;
                cx0Var3.getClass();
                cx0Var3.f22246y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var3.invalidate();
                return;
        }
    }
}
