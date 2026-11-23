package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class gc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35539a;
    public final qc0 f35540b;

    public gc0(qc0 qc0Var, int i7) {
        this.f35539a = i7;
        this.f35540b = qc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35539a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc0 qc0Var = this.f35540b;
                bi.t2 t2Var = qc0Var.f38878e;
                t2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                t2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                t2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = qc0Var.f38889x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                qc0Var.f38887s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                qc0 qc0Var2 = this.f35540b;
                qc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc0Var2.f38874b0 = floatValue2;
                qc0Var2.h(floatValue2);
                qc0Var2.setAlpha(qc0Var2.f38874b0);
                return;
        }
    }
}
