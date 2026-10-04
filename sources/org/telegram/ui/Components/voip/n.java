package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f32023a;
    public final u f32024b;

    public n(u uVar, int i10) {
        this.f32023a = i10;
        this.f32024b = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f32023a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.f32024b;
                uVar.f32178a0 = floatValue;
                uVar.f32180b0.setAlpha(floatValue);
                uVar.f32177a.invalidate();
                return;
            default:
                u uVar2 = this.f32024b;
                p pVar = uVar2.f32177a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !uVar2.K0) {
                    uVar2.f32209x0.setAlpha(1.0f);
                    uVar2.K0 = true;
                    pVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                uVar2.f32209x0.setRotationY(f7);
                pVar.d.setRotationY(f7);
                return;
        }
    }
}
