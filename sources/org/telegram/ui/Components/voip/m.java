package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class m implements ValueAnimator.AnimatorUpdateListener {
    public final int f31589a;
    public final r f31590b;

    public m(r rVar, int i10) {
        this.f31589a = i10;
        this.f31590b = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f31589a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r rVar = this.f31590b;
                rVar.f31664a0 = floatValue;
                rVar.f31666b0.setAlpha(floatValue);
                rVar.f31663a.invalidate();
                return;
            default:
                r rVar2 = this.f31590b;
                n nVar = rVar2.f31663a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !rVar2.K0) {
                    rVar2.f31694x0.setAlpha(1.0f);
                    rVar2.K0 = true;
                    nVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                rVar2.f31694x0.setRotationY(f7);
                nVar.d.setRotationY(f7);
                return;
        }
    }
}
