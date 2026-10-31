package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26624a;
    public final float f26625b;
    public final float f26626c;
    public final float d;
    public final float e;
    public final Object f26627f;

    public h5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f26624a = i10;
        this.f26627f = obj;
        this.f26625b = f7;
        this.f26626c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f26624a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f26626c;
        float f12 = this.f26625b;
        Object obj = this.f26627f;
        switch (i10) {
            case 0:
                o5 o5Var = (o5) obj;
                o5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.lastDrawnCy = org.telegram.messenger.i0.T1(f12, f11, floatValue);
                o5Var.lastDrawnCx = org.telegram.messenger.i0.T1(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f23672s5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = c3.i0.z(f11, f12, floatValue2, f12);
                do0 do0Var = chatActivityEnterView.f23764p0;
                if (do0Var != null) {
                    do0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23764p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.I1();
                return;
        }
    }
}
