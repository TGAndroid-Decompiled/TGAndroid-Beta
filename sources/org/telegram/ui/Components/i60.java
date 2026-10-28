package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29226a;
    public final o60 f29227b;

    public i60(o60 o60Var, int i10) {
        this.f29226a = i10;
        this.f29227b = o60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29226a) {
            case 0:
                o60 o60Var = this.f29227b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * o60Var.getMeasuredHeight() * 0.5f;
                o60Var.f31198w0 = floatValue;
                o60Var.f31192s.setTranslationY(floatValue + o60Var.f31196v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o60 o60Var2 = this.f29227b;
                o60Var2.f31202y0 = floatValue2;
                vi.u0 u0Var = o60Var2.O;
                if (u0Var != null) {
                    u0Var.x(floatValue2);
                    return;
                }
                return;
        }
    }
}
