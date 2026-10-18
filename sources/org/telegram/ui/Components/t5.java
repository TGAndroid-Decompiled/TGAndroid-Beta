package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30464a;
    public final float f30465b;
    public final float f30466c;
    public final float d;
    public final float e;
    public final Object f30467f;

    public t5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f30464a = i10;
        this.f30467f = obj;
        this.f30465b = f7;
        this.f30466c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30464a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f30466c;
        float f12 = this.f30465b;
        Object obj = this.f30467f;
        switch (i10) {
            case 0:
                a6 a6Var = (a6) obj;
                a6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                a6Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f23904n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y3 = com.google.android.gms.internal.play_billing.k3.y(f11, f12, floatValue2, f12);
                sp0 sp0Var = chatActivityEnterView.f23994p0;
                if (sp0Var != null) {
                    sp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23994p0.setTranslationX(y3);
                }
                chatActivityEnterView.Q0.setTranslationX(y3);
                chatActivityEnterView.G = y3;
                chatActivityEnterView.H1();
                return;
        }
    }
}
