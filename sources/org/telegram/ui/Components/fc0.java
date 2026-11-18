package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class fc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35066a;
    public final pc0 f35067b;

    public fc0(pc0 pc0Var, int i7) {
        this.f35066a = i7;
        this.f35067b = pc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35066a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0 pc0Var = this.f35067b;
                bi.p2 p2Var = pc0Var.f38367e;
                p2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                p2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                p2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = pc0Var.f38378x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                pc0Var.f38376s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                pc0 pc0Var2 = this.f35067b;
                pc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0Var2.f38363b0 = floatValue2;
                pc0Var2.h(floatValue2);
                pc0Var2.setAlpha(pc0Var2.f38363b0);
                return;
        }
    }
}
