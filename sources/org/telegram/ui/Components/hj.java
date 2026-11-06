package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hj implements ValueAnimator.AnimatorUpdateListener {
    public final int f34303a;
    public final int f34304b;
    public final float f34305c;
    public final FrameLayout d;

    public hj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f34303a = i10;
        this.d = frameLayout;
        this.f34304b = i7;
        this.f34305c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34303a) {
            case 0:
                vj vjVar = (vj) this.d;
                kj kjVar = vjVar.f38964r;
                kj kjVar2 = vjVar.f38965s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f34304b;
                float f10 = this.f34305c;
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
                ca0 ca0Var = (ca0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((ca0Var.R * floatValue2) + (this.f34304b * f13));
                ca0Var.T = i10;
                ca0Var.f((ca0Var.S * floatValue2) + (this.f34305c * f13), i10);
                return;
        }
    }
}
