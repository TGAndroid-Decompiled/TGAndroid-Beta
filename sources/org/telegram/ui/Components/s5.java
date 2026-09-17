package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30218a;
    public final float f30219b;
    public final float f30220c;
    public final float d;
    public final float f30221e;
    public final Object f30222f;

    public s5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f30218a = i10;
        this.f30222f = obj;
        this.f30219b = f7;
        this.f30220c = f10;
        this.d = f11;
        this.f30221e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30218a;
        float f7 = this.f30221e;
        float f10 = this.d;
        float f11 = this.f30220c;
        float f12 = this.f30219b;
        Object obj = this.f30222f;
        switch (i10) {
            case 0:
                z5 z5Var = (z5) obj;
                z5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                z5Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f23689m5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                xo0 xo0Var = chatActivityEnterView.f23778p0;
                if (xo0Var != null) {
                    xo0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23778p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
