package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30064a;
    public final float f30065b;
    public final float f30066c;
    public final float d;
    public final float e;
    public final Object f30067f;

    public r5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f30064a = i10;
        this.f30067f = obj;
        this.f30065b = f7;
        this.f30066c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30064a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f30066c;
        float f12 = this.f30065b;
        Object obj = this.f30067f;
        switch (i10) {
            case 0:
                y5 y5Var = (y5) obj;
                y5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                y5Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f24051r5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y3 = com.google.android.gms.internal.play_billing.k3.y(f11, f12, floatValue2, f12);
                wp0 wp0Var = chatActivityEnterView.f24143p0;
                if (wp0Var != null) {
                    wp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f24143p0.setTranslationX(y3);
                }
                chatActivityEnterView.Q0.setTranslationX(y3);
                chatActivityEnterView.G = y3;
                chatActivityEnterView.G1();
                return;
        }
    }
}
