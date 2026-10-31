package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class m implements ValueAnimator.AnimatorUpdateListener {
    public final int f31534a;
    public final r f31535b;

    public m(r rVar, int i10) {
        this.f31534a = i10;
        this.f31535b = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f31534a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r rVar = this.f31535b;
                rVar.f31601a0 = floatValue;
                rVar.f31603b0.setAlpha(floatValue);
                rVar.f31600a.invalidate();
                return;
            default:
                r rVar2 = this.f31535b;
                n nVar = rVar2.f31600a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !rVar2.K0) {
                    rVar2.f31631x0.setAlpha(1.0f);
                    rVar2.K0 = true;
                    nVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                rVar2.f31631x0.setRotationY(f7);
                nVar.d.setRotationY(f7);
                return;
        }
    }
}
