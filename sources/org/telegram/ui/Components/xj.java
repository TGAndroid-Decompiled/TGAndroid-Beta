package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class xj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32590a;
    public final int f32591b;
    public final float f32592c;
    public final FrameLayout d;

    public xj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f32590a = i11;
        this.d = frameLayout;
        this.f32591b = i10;
        this.f32592c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32590a) {
            case 0:
                lk lkVar = (lk) this.d;
                ak akVar = lkVar.f28358r;
                ak akVar2 = lkVar.f28359s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f32591b;
                float f7 = this.f32592c;
                if (i10 == 1) {
                    akVar.setTranslationX(f7 * floatValue);
                    akVar.setAlpha(1.0f - floatValue);
                    akVar.invalidate();
                    akVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    akVar2.setScaleX(f10);
                    akVar2.setScaleY(f10);
                    return;
                }
                akVar2.setTranslationX(f7 * floatValue);
                akVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                akVar2.invalidate();
                akVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                akVar.setScaleX(f11);
                akVar.setScaleY(f11);
                akVar2.invalidate();
                return;
            default:
                jc0 jc0Var = (jc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((jc0Var.R * floatValue2) + (this.f32591b * f12));
                jc0Var.T = i11;
                jc0Var.f((jc0Var.S * floatValue2) + (this.f32592c * f12), i11);
                return;
        }
    }
}
