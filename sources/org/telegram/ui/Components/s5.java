package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28158a;
    public final float f28159b;
    public final float f28160c;
    public final float d;
    public final float e;
    public final Object f28161f;

    public s5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f28158a = i10;
        this.f28161f = obj;
        this.f28159b = f7;
        this.f28160c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28158a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f28160c;
        float f12 = this.f28159b;
        Object obj = this.f28161f;
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
                int i11 = ChatActivityEnterView.f21955n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                lp0 lp0Var = chatActivityEnterView.f22044p0;
                if (lp0Var != null) {
                    lp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f22044p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.I1();
                return;
        }
    }
}
