package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31050a;
    public final float f31051b;
    public final float f31052c;
    public final float d;
    public final float f31053e;
    public final Object f31054f;

    public u5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f31050a = i10;
        this.f31054f = obj;
        this.f31051b = f7;
        this.f31052c = f10;
        this.d = f11;
        this.f31053e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31050a;
        float f7 = this.f31053e;
        float f10 = this.d;
        float f11 = this.f31052c;
        float f12 = this.f31051b;
        Object obj = this.f31054f;
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
                int i11 = ChatActivityEnterView.Q5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y3 = com.google.android.gms.internal.vision.e2.y(f11, f12, floatValue2, f12);
                hq0 hq0Var = chatActivityEnterView.f23707p0;
                if (hq0Var != null) {
                    hq0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23707p0.setTranslationX(y3);
                }
                chatActivityEnterView.Q0.setTranslationX(y3);
                chatActivityEnterView.G = y3;
                chatActivityEnterView.M1();
                return;
        }
    }
}
