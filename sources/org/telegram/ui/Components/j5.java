package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34840a;
    public final float f34841b;
    public final float f34842c;
    public final float d;
    public final float f34843e;
    public final Object f34844f;

    public j5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f34840a = i7;
        this.f34844f = obj;
        this.f34841b = f10;
        this.f34842c = f11;
        this.d = f12;
        this.f34843e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f34840a;
        float f10 = this.f34843e;
        float f11 = this.d;
        float f12 = this.f34842c;
        float f13 = this.f34841b;
        Object obj = this.f34844f;
        switch (i7) {
            case 0:
                q5 q5Var = (q5) obj;
                q5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                q5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.s5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z9 = com.google.android.recaptcha.internal.a.z(f12, f13, floatValue2, f13);
                cn0 cn0Var = chatActivityEnterView.f31119p0;
                if (cn0Var != null) {
                    cn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f31119p0.setTranslationX(z9);
                }
                chatActivityEnterView.Q0.setTranslationX(z9);
                chatActivityEnterView.G = z9;
                chatActivityEnterView.L1();
                return;
        }
    }
}
