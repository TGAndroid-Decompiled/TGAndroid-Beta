package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f41354a;
    public final y f41355b;

    public t(y yVar, int i7) {
        this.f41354a = i7;
        this.f41355b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f41354a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f41355b;
                yVar.f41463b0 = floatValue;
                yVar.f41465c0.setAlpha(floatValue);
                yVar.f41460a.invalidate();
                return;
            default:
                y yVar2 = this.f41355b;
                u uVar = yVar2.f41460a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !yVar2.L0) {
                    yVar2.f41494y0.setAlpha(1.0f);
                    yVar2.L0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f41494y0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
