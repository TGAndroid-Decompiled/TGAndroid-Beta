package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f33954a;
    public final t f33955b;

    public n(t tVar, int i10) {
        this.f33954a = i10;
        this.f33955b = tVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f33954a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.f33955b;
                tVar.f34075a0 = floatValue;
                tVar.f34077b0.setAlpha(floatValue);
                tVar.f34074a.invalidate();
                return;
            default:
                t tVar2 = this.f33955b;
                o oVar = tVar2.f34074a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !tVar2.K0) {
                    tVar2.f34105x0.setAlpha(1.0f);
                    tVar2.K0 = true;
                    oVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                tVar2.f34105x0.setRotationY(f7);
                oVar.d.setRotationY(f7);
                return;
        }
    }
}
