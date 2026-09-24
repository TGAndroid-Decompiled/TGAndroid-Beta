package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29883a;
    public final b60 f29884b;

    public w50(b60 b60Var, int i10) {
        this.f29883a = i10;
        this.f29884b = b60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29883a) {
            case 0:
                b60 b60Var = this.f29884b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b60Var.getMeasuredHeight() * 0.5f;
                b60Var.m0 = floatValue;
                b60Var.v.setTranslationY(floatValue + b60Var.f22879l0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b60 b60Var2 = this.f29884b;
                b60Var2.f22882o0 = floatValue2;
                ki.r0 r0Var = b60Var2.M;
                if (r0Var != null) {
                    r0Var.v(floatValue2);
                    return;
                }
                return;
        }
    }
}
