package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29250a;
    public final float f29251b;
    public final float f29252c;
    public final float d;
    public final float e;
    public final Object f29253f;

    public u5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f29250a = i10;
        this.f29253f = obj;
        this.f29251b = f7;
        this.f29252c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29250a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f29252c;
        float f12 = this.f29251b;
        Object obj = this.f29253f;
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
                int i11 = ChatActivityEnterView.f22549n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y3 = com.google.android.gms.internal.play_billing.k3.y(f11, f12, floatValue2, f12);
                xp0 xp0Var = chatActivityEnterView.f22639p0;
                if (xp0Var != null) {
                    xp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f22639p0.setTranslationX(y3);
                }
                chatActivityEnterView.Q0.setTranslationX(y3);
                chatActivityEnterView.G = y3;
                chatActivityEnterView.G1();
                return;
        }
    }
}
