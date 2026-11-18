package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38695a;
    public final float f38696b;
    public final float f38697c;
    public final float d;
    public final float f38698e;
    public final Object f38699f;

    public q5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f38695a = i7;
        this.f38699f = obj;
        this.f38696b = f10;
        this.f38697c = f11;
        this.d = f12;
        this.f38698e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f38695a;
        float f10 = this.f38698e;
        float f11 = this.d;
        float f12 = this.f38697c;
        float f13 = this.f38696b;
        Object obj = this.f38699f;
        switch (i7) {
            case 0:
                x5 x5Var = (x5) obj;
                x5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                x5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.f32538n7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                pn0 pn0Var = chatActivityEnterView.f32662q0;
                if (pn0Var != null) {
                    pn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f32662q0.setTranslationX(z10);
                }
                chatActivityEnterView.R0.setTranslationX(z10);
                chatActivityEnterView.H = z10;
                chatActivityEnterView.m2();
                return;
        }
    }
}
