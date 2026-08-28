package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30690a;
    public final float f30691b;
    public final float f30692c;
    public final float d;
    public final float f30693e;
    public final Object f30694f;

    public m5(Object obj, float f10, float f11, float f12, float f13, int i9) {
        this.f30690a = i9;
        this.f30694f = obj;
        this.f30691b = f10;
        this.f30692c = f11;
        this.d = f12;
        this.f30693e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.f30690a;
        float f10 = this.f30693e;
        float f11 = this.d;
        float f12 = this.f30692c;
        float f13 = this.f30691b;
        Object obj = this.f30694f;
        switch (i9) {
            case 0:
                t5 t5Var = (t5) obj;
                t5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.lastDrawnCy = AndroidUtilities.lerp(f13, f12, floatValue);
                t5Var.lastDrawnCx = AndroidUtilities.lerp(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.f26074i5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = e2.c.z(f12, f13, floatValue2, f13);
                fo0 fo0Var = chatActivityEnterView.f26141l0;
                if (fo0Var != null) {
                    fo0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.f26141l0.setTranslationX(z10);
                }
                chatActivityEnterView.M0.setTranslationX(z10);
                chatActivityEnterView.C = z10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
