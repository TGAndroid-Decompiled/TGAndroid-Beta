package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class zj implements ValueAnimator.AnimatorUpdateListener {
    public final int f35340a;
    public final int f35341b;
    public final float f35342c;
    public final FrameLayout d;

    public zj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f35340a = i11;
        this.d = frameLayout;
        this.f35341b = i10;
        this.f35342c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35340a) {
            case 0:
                nk nkVar = (nk) this.d;
                ck ckVar = nkVar.f31032r;
                ck ckVar2 = nkVar.f31033s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f35341b;
                float f7 = this.f35342c;
                if (i10 == 1) {
                    ckVar.setTranslationX(f7 * floatValue);
                    ckVar.setAlpha(1.0f - floatValue);
                    ckVar.invalidate();
                    ckVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ckVar2.setScaleX(f10);
                    ckVar2.setScaleY(f10);
                    return;
                }
                ckVar2.setTranslationX(f7 * floatValue);
                ckVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ckVar2.invalidate();
                ckVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ckVar.setScaleX(f11);
                ckVar.setScaleY(f11);
                ckVar2.invalidate();
                return;
            default:
                hc0 hc0Var = (hc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((hc0Var.R * floatValue2) + (this.f35341b * f12));
                hc0Var.T = i11;
                hc0Var.f((hc0Var.S * floatValue2) + (this.f35342c * f12), i11);
                return;
        }
    }
}
