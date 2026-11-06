package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class ub0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38578a;
    public final ec0 f38579b;

    public ub0(ec0 ec0Var, int i7) {
        this.f38578a = i7;
        this.f38579b = ec0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38578a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0 ec0Var = this.f38579b;
                di.a4 a4Var = ec0Var.f33220e;
                a4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                a4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                a4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = ec0Var.f33230x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                ec0Var.f33228s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                ec0 ec0Var2 = this.f38579b;
                ec0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0Var2.f33214a0 = floatValue2;
                ec0Var2.h(floatValue2);
                ec0Var2.setAlpha(ec0Var2.f33214a0);
                return;
        }
    }
}
