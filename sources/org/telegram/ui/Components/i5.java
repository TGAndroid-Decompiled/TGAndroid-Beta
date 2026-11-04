package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34593a;
    public final float f34594b;
    public final float f34595c;
    public final float d;
    public final float f34596e;
    public final Object f34597f;

    public i5(Object obj, float f10, float f11, float f12, float f13, int i3) {
        this.f34593a = i3;
        this.f34597f = obj;
        this.f34594b = f10;
        this.f34595c = f11;
        this.d = f12;
        this.f34596e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f34593a;
        float f10 = this.f34596e;
        float f11 = this.d;
        float f12 = this.f34595c;
        float f13 = this.f34594b;
        Object obj = this.f34597f;
        switch (i3) {
            case 0:
                p5 p5Var = (p5) obj;
                p5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                p5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.f31082t5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y9 = com.google.android.recaptcha.internal.a.y(f12, f13, floatValue2, f13);
                fn0 fn0Var = chatActivityEnterView.f31179q0;
                if (fn0Var != null) {
                    fn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f31179q0.setTranslationX(y9);
                }
                chatActivityEnterView.R0.setTranslationX(y9);
                chatActivityEnterView.H = y9;
                chatActivityEnterView.K1();
                return;
        }
    }
}
