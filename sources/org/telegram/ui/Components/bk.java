package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class bk implements ValueAnimator.AnimatorUpdateListener {
    public final int f23029a;
    public final int f23030b;
    public final float f23031c;
    public final FrameLayout d;

    public bk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f23029a = i11;
        this.d = frameLayout;
        this.f23030b = i10;
        this.f23031c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23029a) {
            case 0:
                pk pkVar = (pk) this.d;
                ek ekVar = pkVar.f27373r;
                ek ekVar2 = pkVar.f27374s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f23030b;
                float f7 = this.f23031c;
                if (i10 == 1) {
                    ekVar.setTranslationX(f7 * floatValue);
                    ekVar.setAlpha(1.0f - floatValue);
                    ekVar.invalidate();
                    ekVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ekVar2.setScaleX(f10);
                    ekVar2.setScaleY(f10);
                    return;
                }
                ekVar2.setTranslationX(f7 * floatValue);
                ekVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ekVar2.invalidate();
                ekVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ekVar.setScaleX(f11);
                ekVar.setScaleY(f11);
                ekVar2.invalidate();
                return;
            default:
                zb0 zb0Var = (zb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((zb0Var.R * floatValue2) + (this.f23030b * f12));
                zb0Var.T = i11;
                zb0Var.e((zb0Var.S * floatValue2) + (this.f23031c * f12), i11);
                return;
        }
    }
}
