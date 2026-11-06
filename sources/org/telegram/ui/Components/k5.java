package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35173a;
    public final float f35174b;
    public final float f35175c;
    public final float d;
    public final float f35176e;
    public final Object f35177f;

    public k5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f35173a = i7;
        this.f35177f = obj;
        this.f35174b = f10;
        this.f35175c = f11;
        this.d = f12;
        this.f35176e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f35173a;
        float f10 = this.f35176e;
        float f11 = this.d;
        float f12 = this.f35175c;
        float f13 = this.f35174b;
        Object obj = this.f35177f;
        switch (i7) {
            case 0:
                r5 r5Var = (r5) obj;
                r5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                r5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.s5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z9 = com.google.android.recaptcha.internal.a.z(f12, f13, floatValue2, f13);
                cn0 cn0Var = chatActivityEnterView.f31098p0;
                if (cn0Var != null) {
                    cn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f31098p0.setTranslationX(z9);
                }
                chatActivityEnterView.Q0.setTranslationX(z9);
                chatActivityEnterView.G = z9;
                chatActivityEnterView.L1();
                return;
        }
    }
}
