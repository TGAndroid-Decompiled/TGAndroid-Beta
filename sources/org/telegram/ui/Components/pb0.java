package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class pb0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37112a;
    public final zb0 f37113b;

    public pb0(zb0 zb0Var, int i3) {
        this.f37112a = i3;
        this.f37113b = zb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37112a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0 zb0Var = this.f37113b;
                ai.d2 d2Var = zb0Var.f41005e;
                d2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                d2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                d2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = zb0Var.f41016x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                zb0Var.f41014s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                zb0 zb0Var2 = this.f37113b;
                zb0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0Var2.f41001b0 = floatValue2;
                zb0Var2.h(floatValue2);
                zb0Var2.setAlpha(zb0Var2.f41001b0);
                return;
        }
    }
}
