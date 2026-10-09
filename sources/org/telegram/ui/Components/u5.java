package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31369a;
    public final float f31370b;
    public final float f31371c;
    public final float d;
    public final float f31372e;
    public final Object f31373f;

    public u5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f31369a = i10;
        this.f31373f = obj;
        this.f31370b = f7;
        this.f31371c = f10;
        this.d = f11;
        this.f31372e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31369a;
        float f7 = this.f31372e;
        float f10 = this.d;
        float f11 = this.f31371c;
        float f12 = this.f31370b;
        Object obj = this.f31373f;
        switch (i10) {
            case 0:
                b6 b6Var = (b6) obj;
                b6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                b6Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f23850n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y3 = com.google.android.gms.internal.vision.e2.y(f11, f12, floatValue2, f12);
                bq0 bq0Var = chatActivityEnterView.f23940p0;
                if (bq0Var != null) {
                    bq0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23940p0.setTranslationX(y3);
                }
                chatActivityEnterView.Q0.setTranslationX(y3);
                chatActivityEnterView.G = y3;
                chatActivityEnterView.H1();
                return;
        }
    }
}
