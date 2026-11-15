package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class vb0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40374a;
    public final fc0 f40375b;

    public vb0(fc0 fc0Var, int i7) {
        this.f40374a = i7;
        this.f40375b = fc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40374a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0 fc0Var = this.f40375b;
                bi.v1 v1Var = fc0Var.f34567e;
                v1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                v1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                v1Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = fc0Var.f34578x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                fc0Var.f34576s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                fc0 fc0Var2 = this.f40375b;
                fc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var2.f34563b0 = floatValue2;
                fc0Var2.h(floatValue2);
                fc0Var2.setAlpha(fc0Var2.f34563b0);
                return;
        }
    }
}
