package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class oj implements ValueAnimator.AnimatorUpdateListener {
    public final int f38003a;
    public final int f38004b;
    public final float f38005c;
    public final FrameLayout d;

    public oj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f38003a = i10;
        this.d = frameLayout;
        this.f38004b = i7;
        this.f38005c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38003a) {
            case 0:
                dk dkVar = (dk) this.d;
                rj rjVar = dkVar.f33965r;
                rj rjVar2 = dkVar.f33966s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f38004b;
                float f10 = this.f38005c;
                if (i7 == 1) {
                    rjVar.setTranslationX(f10 * floatValue);
                    rjVar.setAlpha(1.0f - floatValue);
                    rjVar.invalidate();
                    rjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    rjVar2.setScaleX(f11);
                    rjVar2.setScaleY(f11);
                    return;
                }
                rjVar2.setTranslationX(f10 * floatValue);
                rjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                rjVar2.invalidate();
                rjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                rjVar.setScaleX(f12);
                rjVar.setScaleY(f12);
                rjVar2.invalidate();
                return;
            default:
                da0 da0Var = (da0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((da0Var.S * floatValue2) + (this.f38004b * f13));
                da0Var.U = i10;
                da0Var.f((da0Var.T * floatValue2) + (this.f38005c * f13), i10);
                return;
        }
    }
}
