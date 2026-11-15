package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37031a;
    public final o11 f37032b;

    public m11(o11 o11Var, int i7) {
        this.f37031a = i7;
        this.f37032b = o11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37031a) {
            case 0:
                o11 o11Var = this.f37032b;
                o11Var.getClass();
                o11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.h();
                o11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                o11 o11Var2 = this.f37032b;
                o11Var2.M = max;
                o11Var2.h.invalidate();
                return;
        }
    }
}
