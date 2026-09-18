package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27216a;
    public final float f27217b;
    public final float f27218c;
    public final float d;
    public final float e;
    public final Object f27219f;

    public q5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f27216a = i10;
        this.f27219f = obj;
        this.f27217b = f7;
        this.f27218c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27216a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f27218c;
        float f12 = this.f27217b;
        Object obj = this.f27219f;
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
                int i11 = ChatActivityEnterView.f21743n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                xo0 xo0Var = chatActivityEnterView.f21832p0;
                if (xo0Var != null) {
                    xo0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f21832p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
