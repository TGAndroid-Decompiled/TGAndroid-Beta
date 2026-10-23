package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27692a;
    public final q00 f27693b;

    public k00(q00 q00Var, int i10) {
        this.f27692a = i10;
        this.f27693b = q00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27692a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00 q00Var = this.f27693b;
                q00Var.f29453x = floatValue;
                q00Var.invalidate();
                return;
            default:
                q00 q00Var2 = this.f27693b;
                q00Var2.getClass();
                q00Var2.f29454y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00Var2.invalidate();
                return;
        }
    }
}
