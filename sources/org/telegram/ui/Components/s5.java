package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28151a;
    public final float f28152b;
    public final float f28153c;
    public final float d;
    public final float e;
    public final Object f28154f;

    public s5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f28151a = i10;
        this.f28154f = obj;
        this.f28152b = f7;
        this.f28153c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28151a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f28153c;
        float f12 = this.f28152b;
        Object obj = this.f28154f;
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
                int i11 = ChatActivityEnterView.f21953n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                jp0 jp0Var = chatActivityEnterView.f22042p0;
                if (jp0Var != null) {
                    jp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f22042p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
