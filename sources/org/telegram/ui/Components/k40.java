package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36276a;
    public final q40 f36277b;

    public k40(q40 q40Var, int i7) {
        this.f36276a = i7;
        this.f36277b = q40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36276a) {
            case 0:
                q40 q40Var = this.f36277b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * q40Var.getMeasuredHeight() * 0.5f;
                q40Var.f38517y0 = floatValue;
                q40Var.f38507s.setTranslationY(floatValue + q40Var.f38515x0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q40 q40Var2 = this.f36277b;
                q40Var2.A0 = floatValue2;
                zi.v0 v0Var = q40Var2.P;
                if (v0Var != null) {
                    v0Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
