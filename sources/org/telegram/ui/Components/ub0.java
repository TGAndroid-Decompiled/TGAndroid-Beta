package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class ub0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38618a;
    public final ec0 f38619b;

    public ub0(ec0 ec0Var, int i7) {
        this.f38618a = i7;
        this.f38619b = ec0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38618a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0 ec0Var = this.f38619b;
                di.b4 b4Var = ec0Var.f33211e;
                b4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                b4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                b4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = ec0Var.f33221x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                ec0Var.f33219s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                ec0 ec0Var2 = this.f38619b;
                ec0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0Var2.f33205a0 = floatValue2;
                ec0Var2.h(floatValue2);
                ec0Var2.setAlpha(ec0Var2.f33205a0);
                return;
        }
    }
}
