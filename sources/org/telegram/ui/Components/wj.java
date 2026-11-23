package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class wj implements ValueAnimator.AnimatorUpdateListener {
    public final int f41669a;
    public final int f41670b;
    public final float f41671c;
    public final FrameLayout d;

    public wj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f41669a = i10;
        this.d = frameLayout;
        this.f41670b = i7;
        this.f41671c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41669a) {
            case 0:
                kk kkVar = (kk) this.d;
                zj zjVar = kkVar.f36766r;
                zj zjVar2 = kkVar.f36767s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f41670b;
                float f10 = this.f41671c;
                if (i7 == 1) {
                    zjVar.setTranslationX(f10 * floatValue);
                    zjVar.setAlpha(1.0f - floatValue);
                    zjVar.invalidate();
                    zjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    zjVar2.setScaleX(f11);
                    zjVar2.setScaleY(f11);
                    return;
                }
                zjVar2.setTranslationX(f10 * floatValue);
                zjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                zjVar2.invalidate();
                zjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                zjVar.setScaleX(f12);
                zjVar.setScaleY(f12);
                zjVar2.invalidate();
                return;
            default:
                na0 na0Var = (na0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((na0Var.S * floatValue2) + (this.f41670b * f13));
                na0Var.U = i10;
                na0Var.f((na0Var.T * floatValue2) + (this.f41671c * f13), i10);
                return;
        }
    }
}
