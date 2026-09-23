package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27826a;
    public final float f27827b;
    public final float f27828c;
    public final float d;
    public final float e;
    public final Object f27829f;

    public s5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f27826a = i10;
        this.f27829f = obj;
        this.f27827b = f7;
        this.f27828c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27826a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f27828c;
        float f12 = this.f27827b;
        Object obj = this.f27829f;
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
                int i11 = ChatActivityEnterView.f21701n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                wo0 wo0Var = chatActivityEnterView.f21790p0;
                if (wo0Var != null) {
                    wo0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f21790p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.K1();
                return;
        }
    }
}
