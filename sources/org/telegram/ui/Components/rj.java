package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class rj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32189a;
    public final int f32190b;
    public final float f32191c;
    public final FrameLayout d;

    public rj(FrameLayout frameLayout, int i9, float f10, int i10) {
        this.f32189a = i10;
        this.d = frameLayout;
        this.f32190b = i9;
        this.f32191c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32189a) {
            case 0:
                fk fkVar = (fk) this.d;
                uj ujVar = fkVar.f28459r;
                uj ujVar2 = fkVar.f28460s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i9 = this.f32190b;
                float f10 = this.f32191c;
                if (i9 == 1) {
                    ujVar.setTranslationX(f10 * floatValue);
                    ujVar.setAlpha(1.0f - floatValue);
                    ujVar.invalidate();
                    ujVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    ujVar2.setScaleX(f11);
                    ujVar2.setScaleY(f11);
                    return;
                }
                ujVar2.setTranslationX(f10 * floatValue);
                ujVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ujVar2.invalidate();
                ujVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                ujVar.setScaleX(f12);
                ujVar.setScaleY(f12);
                ujVar2.invalidate();
                return;
            default:
                wa0 wa0Var = (wa0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((wa0Var.N * floatValue2) + (this.f32190b * f13));
                wa0Var.P = i10;
                wa0Var.e((wa0Var.O * floatValue2) + (this.f32191c * f13), i10);
                return;
        }
    }
}
