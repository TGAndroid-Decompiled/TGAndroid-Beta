package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30620a;
    public final float f30621b;
    public final float f30622c;
    public final float d;
    public final float f30623e;
    public final Object f30624f;

    public s5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f30620a = i10;
        this.f30624f = obj;
        this.f30621b = f7;
        this.f30622c = f10;
        this.d = f11;
        this.f30623e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30620a;
        float f7 = this.f30623e;
        float f10 = this.d;
        float f11 = this.f30622c;
        float f12 = this.f30621b;
        Object obj = this.f30624f;
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
                int i11 = ChatActivityEnterView.f23847n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f11, f12, floatValue2, f12);
                pp0 pp0Var = chatActivityEnterView.f23937p0;
                if (pp0Var != null) {
                    pp0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23937p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.I1();
                return;
        }
    }
}
