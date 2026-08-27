package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class a21 implements ValueAnimator.AnimatorUpdateListener {

    public final int f26601a;

    public final c21 f26602b;

    public a21(c21 c21Var, int i10) {
        this.f26601a = i10;
        this.f26602b = c21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26601a) {
            case 0:
                c21 c21Var = this.f26602b;
                c21Var.getClass();
                c21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c21Var.h();
                c21Var.g();
                break;
            default:
                float fMax = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c21 c21Var2 = this.f26602b;
                c21Var2.G = fMax;
                c21Var2.h.invalidate();
                break;
        }
    }
}
