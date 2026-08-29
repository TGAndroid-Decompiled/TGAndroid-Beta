package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32179a;
    public final float f32180b;
    public final float f32181c;
    public final float d;
    public final float f32182e;
    public final Object f32183f;

    public r5(Object obj, float f9, float f10, float f11, float f12, int i10) {
        this.f32179a = i10;
        this.f32183f = obj;
        this.f32180b = f9;
        this.f32181c = f10;
        this.d = f11;
        this.f32182e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f32179a;
        float f9 = this.f32182e;
        float f10 = this.d;
        float f11 = this.f32181c;
        float f12 = this.f32180b;
        Object obj = this.f32183f;
        switch (i10) {
            case 0:
                y5 y5Var = (y5) obj;
                y5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                y5Var.lastDrawnCx = AndroidUtilities.lerp(f10, f9, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f26085i5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.recaptcha.internal.a.z(f11, f12, floatValue2, f12);
                qo0 qo0Var = chatActivityEnterView.f26152l0;
                if (qo0Var != null) {
                    qo0Var.setAlpha(((f9 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f26152l0.setTranslationX(z10);
                }
                chatActivityEnterView.M0.setTranslationX(z10);
                chatActivityEnterView.C = z10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
