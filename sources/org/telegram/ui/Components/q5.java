package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27247a;
    public final float f27248b;
    public final float f27249c;
    public final float d;
    public final float e;
    public final Object f27250f;

    public q5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f27247a = i10;
        this.f27250f = obj;
        this.f27248b = f7;
        this.f27249c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27247a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f27249c;
        float f12 = this.f27248b;
        Object obj = this.f27250f;
        switch (i10) {
            case 0:
                x5 x5Var = (x5) obj;
                x5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                x5Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f21727n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                wo0 wo0Var = chatActivityEnterView.f21816p0;
                if (wo0Var != null) {
                    wo0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f21816p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.K1();
                return;
        }
    }
}
