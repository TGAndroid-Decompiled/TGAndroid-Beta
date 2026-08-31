package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29403a;
    public final float f29404b;
    public final float f29405c;
    public final float d;
    public final float f29406e;
    public final Object f29407f;

    public n5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f29403a = i10;
        this.f29407f = obj;
        this.f29404b = f10;
        this.f29405c = f11;
        this.d = f12;
        this.f29406e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29403a;
        float f10 = this.f29406e;
        float f11 = this.d;
        float f12 = this.f29405c;
        float f13 = this.f29404b;
        Object obj = this.f29407f;
        switch (i10) {
            case 0:
                u5 u5Var = (u5) obj;
                u5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5Var.lastDrawnCy = AndroidUtilities.lerp(f13, f12, floatValue);
                u5Var.lastDrawnCx = AndroidUtilities.lerp(f11, f10, floatValue);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.f24568j5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float w10 = e2.c.w(f12, f13, floatValue2, f13);
                bp0 bp0Var = chatActivityEnterView.m0;
                if (bp0Var != null) {
                    bp0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.m0.setTranslationX(w10);
                }
                chatActivityEnterView.N0.setTranslationX(w10);
                chatActivityEnterView.D = w10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
