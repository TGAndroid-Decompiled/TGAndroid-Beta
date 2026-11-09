package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class vb0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39033a;
    public final fc0 f39034b;

    public vb0(fc0 fc0Var, int i7) {
        this.f39033a = i7;
        this.f39034b = fc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39033a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0 fc0Var = this.f39034b;
                di.b4 b4Var = fc0Var.f33625e;
                b4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                b4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                b4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = fc0Var.f33635x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                fc0Var.f33633s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                fc0 fc0Var2 = this.f39034b;
                fc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var2.f33619a0 = floatValue2;
                fc0Var2.h(floatValue2);
                fc0Var2.setAlpha(fc0Var2.f33619a0);
                return;
        }
    }
}
