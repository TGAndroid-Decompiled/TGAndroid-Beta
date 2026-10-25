package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29198a;
    public final n60 f29199b;

    public i60(n60 n60Var, int i10) {
        this.f29198a = i10;
        this.f29199b = n60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29198a) {
            case 0:
                n60 n60Var = this.f29199b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n60Var.getMeasuredHeight() * 0.5f;
                n60Var.f30873w0 = floatValue;
                n60Var.v.setTranslationY(floatValue + n60Var.f30871v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60 n60Var2 = this.f29199b;
                n60Var2.f30877y0 = floatValue2;
                vi.s0 s0Var = n60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
