package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39030a;
    public final float f39031b;
    public final float f39032c;
    public final float d;
    public final float f39033e;
    public final Object f39034f;

    public r5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f39030a = i7;
        this.f39034f = obj;
        this.f39031b = f10;
        this.f39032c = f11;
        this.d = f12;
        this.f39033e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f39030a;
        float f10 = this.f39033e;
        float f11 = this.d;
        float f12 = this.f39032c;
        float f13 = this.f39031b;
        Object obj = this.f39034f;
        switch (i7) {
            case 0:
                y5 y5Var = (y5) obj;
                y5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                y5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.f32535s7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                rn0 rn0Var = chatActivityEnterView.f32662q0;
                if (rn0Var != null) {
                    rn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f32662q0.setTranslationX(z10);
                }
                chatActivityEnterView.R0.setTranslationX(z10);
                chatActivityEnterView.H = z10;
                chatActivityEnterView.q2();
                return;
        }
    }
}
