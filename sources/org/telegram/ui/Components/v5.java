package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33563a;
    public final float f33564b;
    public final float f33565c;
    public final float d;
    public final float e;
    public final Object f33566f;

    public v5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f33563a = i10;
        this.f33566f = obj;
        this.f33564b = f7;
        this.f33565c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f33563a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f33565c;
        float f12 = this.f33564b;
        Object obj = this.f33566f;
        switch (i10) {
            case 0:
                c6 c6Var = (c6) obj;
                c6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                c6Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f25841r5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = c3.h0.z(f11, f12, floatValue2, f12);
                cq0 cq0Var = chatActivityEnterView.f25933p0;
                if (cq0Var != null) {
                    cq0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f25933p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.G1();
                return;
        }
    }
}
