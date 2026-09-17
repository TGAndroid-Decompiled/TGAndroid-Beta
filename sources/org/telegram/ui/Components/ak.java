package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ak implements ValueAnimator.AnimatorUpdateListener {
    public final int f22426a;
    public final int f22427b;
    public final float f22428c;
    public final FrameLayout d;

    public ak(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f22426a = i11;
        this.d = frameLayout;
        this.f22427b = i10;
        this.f22428c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22426a) {
            case 0:
                ok okVar = (ok) this.d;
                dk dkVar = okVar.f26763r;
                dk dkVar2 = okVar.f26764s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f22427b;
                float f7 = this.f22428c;
                if (i10 == 1) {
                    dkVar.setTranslationX(f7 * floatValue);
                    dkVar.setAlpha(1.0f - floatValue);
                    dkVar.invalidate();
                    dkVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    dkVar2.setScaleX(f10);
                    dkVar2.setScaleY(f10);
                    return;
                }
                dkVar2.setTranslationX(f7 * floatValue);
                dkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                dkVar2.invalidate();
                dkVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                dkVar.setScaleX(f11);
                dkVar.setScaleY(f11);
                dkVar2.invalidate();
                return;
            default:
                pb0 pb0Var = (pb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((pb0Var.R * floatValue2) + (this.f22427b * f12));
                pb0Var.T = i11;
                pb0Var.e((pb0Var.S * floatValue2) + (this.f22428c * f12), i11);
                return;
        }
    }
}
