package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hj implements ValueAnimator.AnimatorUpdateListener {
    public final int f34314a;
    public final int f34315b;
    public final float f34316c;
    public final FrameLayout d;

    public hj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f34314a = i10;
        this.d = frameLayout;
        this.f34315b = i7;
        this.f34316c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34314a) {
            case 0:
                vj vjVar = (vj) this.d;
                kj kjVar = vjVar.f39113r;
                kj kjVar2 = vjVar.f39114s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f34315b;
                float f10 = this.f34316c;
                if (i7 == 1) {
                    kjVar.setTranslationX(f10 * floatValue);
                    kjVar.setAlpha(1.0f - floatValue);
                    kjVar.invalidate();
                    kjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    kjVar2.setScaleX(f11);
                    kjVar2.setScaleY(f11);
                    return;
                }
                kjVar2.setTranslationX(f10 * floatValue);
                kjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                kjVar2.invalidate();
                kjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                kjVar.setScaleX(f12);
                kjVar.setScaleY(f12);
                kjVar2.invalidate();
                return;
            default:
                da0 da0Var = (da0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((da0Var.R * floatValue2) + (this.f34315b * f13));
                da0Var.T = i10;
                da0Var.f((da0Var.S * floatValue2) + (this.f34316c * f13), i10);
                return;
        }
    }
}
