package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f39537a;
    public final y f39538b;

    public t(y yVar, int i7) {
        this.f39537a = i7;
        this.f39538b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.f39537a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f39538b;
                yVar.f39637a0 = floatValue;
                yVar.f39639b0.setAlpha(floatValue);
                yVar.f39636a.invalidate();
                return;
            default:
                y yVar2 = this.f39538b;
                u uVar = yVar2.f39636a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z9 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z9 = true;
                }
                if (z9 && !yVar2.K0) {
                    yVar2.f39668x0.setAlpha(1.0f);
                    yVar2.K0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f39668x0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
