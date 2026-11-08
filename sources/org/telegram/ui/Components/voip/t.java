package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f39528a;
    public final y f39529b;

    public t(y yVar, int i7) {
        this.f39528a = i7;
        this.f39529b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.f39528a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f39529b;
                yVar.f39626a0 = floatValue;
                yVar.f39628b0.setAlpha(floatValue);
                yVar.f39625a.invalidate();
                return;
            default:
                y yVar2 = this.f39529b;
                u uVar = yVar2.f39625a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z9 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z9 = true;
                }
                if (z9 && !yVar2.K0) {
                    yVar2.f39657x0.setAlpha(1.0f);
                    yVar2.K0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f39657x0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
