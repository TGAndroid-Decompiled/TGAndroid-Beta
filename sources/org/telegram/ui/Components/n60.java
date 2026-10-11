package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29054a;
    public final s60 f29055b;

    public n60(s60 s60Var, int i10) {
        this.f29054a = i10;
        this.f29055b = s60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29054a) {
            case 0:
                s60 s60Var = this.f29055b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * s60Var.getMeasuredHeight() * 0.5f;
                s60Var.f30776w0 = floatValue;
                s60Var.v.setTranslationY(floatValue + s60Var.f30774v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s60 s60Var2 = this.f29055b;
                s60Var2.f30780y0 = floatValue2;
                ki.v0 v0Var = s60Var2.P;
                if (v0Var != null) {
                    v0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
