package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class at0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22721a;
    public final eu0 f22722b;
    public final lv0 f22723c;

    public at0(lv0 lv0Var, eu0 eu0Var, int i10) {
        this.f22721a = i10;
        this.f22723c = lv0Var;
        this.f22722b = eu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22721a) {
            case 0:
                this.f22723c.f26141n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22722b.h.invalidate();
                return;
            default:
                this.f22723c.f26141n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22722b.h.invalidate();
                return;
        }
    }
}
