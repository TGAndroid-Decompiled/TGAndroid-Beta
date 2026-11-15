package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35449a;
    public final float f35450b;
    public final float f35451c;
    public final float d;
    public final float f35452e;
    public final Object f35453f;

    public i5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f35449a = i7;
        this.f35453f = obj;
        this.f35450b = f10;
        this.f35451c = f11;
        this.d = f12;
        this.f35452e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f35449a;
        float f10 = this.f35452e;
        float f11 = this.d;
        float f12 = this.f35451c;
        float f13 = this.f35450b;
        Object obj = this.f35453f;
        switch (i7) {
            case 0:
                p5 p5Var = (p5) obj;
                p5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                p5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.N6;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                gn0 gn0Var = chatActivityEnterView.f32265q0;
                if (gn0Var != null) {
                    gn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f32265q0.setTranslationX(z10);
                }
                chatActivityEnterView.R0.setTranslationX(z10);
                chatActivityEnterView.H = z10;
                chatActivityEnterView.d2();
                return;
        }
    }
}
