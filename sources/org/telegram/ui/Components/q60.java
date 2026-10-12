package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29735a;
    public final v60 f29736b;

    public q60(v60 v60Var, int i10) {
        this.f29735a = i10;
        this.f29736b = v60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29735a) {
            case 0:
                v60 v60Var = this.f29736b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * v60Var.getMeasuredHeight() * 0.5f;
                v60Var.f31438w0 = floatValue;
                v60Var.v.setTranslationY(floatValue + v60Var.f31436v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v60 v60Var2 = this.f29736b;
                v60Var2.f31442y0 = floatValue2;
                qi.p0 p0Var = v60Var2.P;
                if (p0Var != null) {
                    p0Var.z(floatValue2);
                    return;
                }
                return;
        }
    }
}
