package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31431a;
    public final float f31432b;
    public final float f31433c;
    public final float d;
    public final float f31434e;
    public final Object f31435f;

    public u5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f31431a = i10;
        this.f31435f = obj;
        this.f31432b = f7;
        this.f31433c = f10;
        this.d = f11;
        this.f31434e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31431a;
        float f7 = this.f31434e;
        float f10 = this.d;
        float f11 = this.f31433c;
        float f12 = this.f31432b;
        Object obj = this.f31435f;
        switch (i10) {
            case 0:
                b6 b6Var = (b6) obj;
                b6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                b6Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f23878n5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y3 = com.google.android.gms.internal.vision.e2.y(f11, f12, floatValue2, f12);
                cq0 cq0Var = chatActivityEnterView.f23968p0;
                if (cq0Var != null) {
                    cq0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.f23968p0.setTranslationX(y3);
                }
                chatActivityEnterView.Q0.setTranslationX(y3);
                chatActivityEnterView.G = y3;
                chatActivityEnterView.H1();
                return;
        }
    }
}
