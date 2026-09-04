package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ak implements ValueAnimator.AnimatorUpdateListener {
    public final int f24411a;
    public final int f24412b;
    public final float f24413c;
    public final FrameLayout d;

    public ak(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f24411a = i11;
        this.d = frameLayout;
        this.f24412b = i10;
        this.f24413c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24411a) {
            case 0:
                ok okVar = (ok) this.d;
                dk dkVar = okVar.f29092r;
                dk dkVar2 = okVar.f29093s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f24412b;
                float f7 = this.f24413c;
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
                qb0 qb0Var = (qb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((qb0Var.R * floatValue2) + (this.f24412b * f12));
                qb0Var.T = i11;
                qb0Var.e((qb0Var.S * floatValue2) + (this.f24413c * f12), i11);
                return;
        }
    }
}
