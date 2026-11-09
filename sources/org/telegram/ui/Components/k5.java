package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35233a;
    public final float f35234b;
    public final float f35235c;
    public final float d;
    public final float f35236e;
    public final Object f35237f;

    public k5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f35233a = i7;
        this.f35237f = obj;
        this.f35234b = f10;
        this.f35235c = f11;
        this.d = f12;
        this.f35236e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f35233a;
        float f10 = this.f35236e;
        float f11 = this.d;
        float f12 = this.f35235c;
        float f13 = this.f35234b;
        Object obj = this.f35237f;
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
                dn0 dn0Var = chatActivityEnterView.f31108p0;
                if (dn0Var != null) {
                    dn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f31108p0.setTranslationX(z9);
                }
                chatActivityEnterView.Q0.setTranslationX(z9);
                chatActivityEnterView.G = z9;
                chatActivityEnterView.L1();
                return;
        }
    }
}
