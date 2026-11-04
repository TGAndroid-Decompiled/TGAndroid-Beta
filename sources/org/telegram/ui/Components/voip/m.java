package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class m implements ValueAnimator.AnimatorUpdateListener {
    public final int f39466a;
    public final r f39467b;

    public m(r rVar, int i3) {
        this.f39466a = i3;
        this.f39467b = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f39466a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r rVar = this.f39467b;
                rVar.f39549b0 = floatValue;
                rVar.f39551c0.setAlpha(floatValue);
                rVar.f39546a.invalidate();
                return;
            default:
                r rVar2 = this.f39467b;
                n nVar = rVar2.f39546a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !rVar2.L0) {
                    rVar2.f39580y0.setAlpha(1.0f);
                    rVar2.L0 = true;
                    nVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                rVar2.f39580y0.setRotationY(f10);
                nVar.d.setRotationY(f10);
                return;
        }
    }
}
