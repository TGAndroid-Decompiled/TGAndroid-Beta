package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27765a;
    public final float f27766b;
    public final float f27767c;
    public final float d;
    public final float e;
    public final Object f27768f;

    public r5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f27765a = i10;
        this.f27768f = obj;
        this.f27766b = f7;
        this.f27767c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27765a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f27767c;
        float f12 = this.f27766b;
        Object obj = this.f27768f;
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
                int i11 = ChatActivityEnterView.f21952m5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                jp0 jp0Var = chatActivityEnterView.f22040p0;
                if (jp0Var != null) {
                    jp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f22040p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.I1();
                return;
        }
    }
}
