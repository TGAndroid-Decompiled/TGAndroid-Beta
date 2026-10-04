package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30619a;
    public final float f30620b;
    public final float f30621c;
    public final float d;
    public final float f30622e;
    public final Object f30623f;

    public s5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f30619a = i10;
        this.f30623f = obj;
        this.f30620b = f7;
        this.f30621c = f10;
        this.d = f11;
        this.f30622e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30619a;
        float f7 = this.f30622e;
        float f10 = this.d;
        float f11 = this.f30621c;
        float f12 = this.f30620b;
        Object obj = this.f30623f;
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
                int i11 = ChatActivityEnterView.f23846n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                pp0 pp0Var = chatActivityEnterView.f23936p0;
                if (pp0Var != null) {
                    pp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23936p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.I1();
                return;
        }
    }
}
