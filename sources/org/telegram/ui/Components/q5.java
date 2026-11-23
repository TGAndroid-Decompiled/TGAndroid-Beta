package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38691a;
    public final float f38692b;
    public final float f38693c;
    public final float d;
    public final float f38694e;
    public final Object f38695f;

    public q5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f38691a = i7;
        this.f38695f = obj;
        this.f38692b = f10;
        this.f38693c = f11;
        this.d = f12;
        this.f38694e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f38691a;
        float f10 = this.f38694e;
        float f11 = this.d;
        float f12 = this.f38693c;
        float f13 = this.f38692b;
        Object obj = this.f38695f;
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
                int i10 = ChatActivityEnterView.f32633s7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                qn0 qn0Var = chatActivityEnterView.f32760q0;
                if (qn0Var != null) {
                    qn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f32760q0.setTranslationX(z10);
                }
                chatActivityEnterView.R0.setTranslationX(z10);
                chatActivityEnterView.H = z10;
                chatActivityEnterView.s2();
                return;
        }
    }
}
