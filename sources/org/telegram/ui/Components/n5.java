package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29387a;
    public final float f29388b;
    public final float f29389c;
    public final float d;
    public final float f29390e;
    public final Object f29391f;

    public n5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f29387a = i10;
        this.f29391f = obj;
        this.f29388b = f10;
        this.f29389c = f11;
        this.d = f12;
        this.f29390e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29387a;
        float f10 = this.f29390e;
        float f11 = this.d;
        float f12 = this.f29389c;
        float f13 = this.f29388b;
        Object obj = this.f29391f;
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
                int i11 = ChatActivityEnterView.f24570j5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float w10 = e2.c.w(f12, f13, floatValue2, f13);
                ap0 ap0Var = chatActivityEnterView.m0;
                if (ap0Var != null) {
                    ap0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.m0.setTranslationX(w10);
                }
                chatActivityEnterView.N0.setTranslationX(w10);
                chatActivityEnterView.D = w10;
                chatActivityEnterView.J1();
                return;
        }
    }
}
