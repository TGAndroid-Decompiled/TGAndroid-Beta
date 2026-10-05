package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class dk implements ValueAnimator.AnimatorUpdateListener {
    public final int f25806a;
    public final int f25807b;
    public final float f25808c;
    public final FrameLayout d;

    public dk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f25806a = i11;
        this.d = frameLayout;
        this.f25807b = i10;
        this.f25808c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25806a) {
            case 0:
                rk rkVar = (rk) this.d;
                gk gkVar = rkVar.f30521r;
                gk gkVar2 = rkVar.f30522s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f25807b;
                float f7 = this.f25808c;
                if (i10 == 1) {
                    gkVar.setTranslationX(f7 * floatValue);
                    gkVar.setAlpha(1.0f - floatValue);
                    gkVar.invalidate();
                    gkVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    gkVar2.setScaleX(f10);
                    gkVar2.setScaleY(f10);
                    return;
                }
                gkVar2.setTranslationX(f7 * floatValue);
                gkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                gkVar2.invalidate();
                gkVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                gkVar.setScaleX(f11);
                gkVar.setScaleY(f11);
                gkVar2.invalidate();
                return;
            default:
                cc0 cc0Var = (cc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((cc0Var.R * floatValue2) + (this.f25807b * f12));
                cc0Var.T = i11;
                cc0Var.e((cc0Var.S * floatValue2) + (this.f25808c * f12), i11);
                return;
        }
    }
}
