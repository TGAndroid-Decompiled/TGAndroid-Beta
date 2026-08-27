package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class m5 implements ValueAnimator.AnimatorUpdateListener {

    public final int f30560a;

    public final float f30561b;

    public final float f30562c;
    public final float d;

    public final float f30563e;

    public final Object f30564f;

    public m5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f30560a = i10;
        this.f30564f = obj;
        this.f30561b = f10;
        this.f30562c = f11;
        this.d = f12;
        this.f30563e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30560a;
        float f10 = this.f30563e;
        float f11 = this.d;
        float f12 = this.f30562c;
        float f13 = this.f30561b;
        Object obj = this.f30564f;
        switch (i10) {
            case 0:
                t5 t5Var = (t5) obj;
                t5Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.lastDrawnCy = AndroidUtilities.lerp(f13, f12, fFloatValue);
                t5Var.lastDrawnCx = AndroidUtilities.lerp(f11, f10, fFloatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f26070i5;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fZ = com.google.android.recaptcha.internal.a.z(f12, f13, fFloatValue2, f13);
                go0 go0Var = chatActivityEnterView.f26137l0;
                if (go0Var != null) {
                    go0Var.setAlpha(((f10 - f11) * fFloatValue2) + f11);
                    chatActivityEnterView.f26137l0.setTranslationX(fZ);
                }
                chatActivityEnterView.M0.setTranslationX(fZ);
                chatActivityEnterView.C = fZ;
                chatActivityEnterView.I1();
                break;
        }
    }
}
