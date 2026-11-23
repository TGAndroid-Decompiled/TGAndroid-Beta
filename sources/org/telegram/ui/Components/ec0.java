package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class ec0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34688a;
    public final oc0 f34689b;

    public ec0(oc0 oc0Var, int i7) {
        this.f34688a = i7;
        this.f34689b = oc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34688a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc0 oc0Var = this.f34689b;
                bi.v2 v2Var = oc0Var.f38114e;
                v2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                v2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                v2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = oc0Var.f38125x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                oc0Var.f38123s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                oc0 oc0Var2 = this.f34689b;
                oc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc0Var2.f38110b0 = floatValue2;
                oc0Var2.h(floatValue2);
                oc0Var2.setAlpha(oc0Var2.f38110b0);
                return;
        }
    }
}
