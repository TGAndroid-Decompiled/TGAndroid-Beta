package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f41251a;
    public final z f41252b;

    public u(z zVar, int i7) {
        this.f41251a = i7;
        this.f41252b = zVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f41251a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z zVar = this.f41252b;
                zVar.f41360b0 = floatValue;
                zVar.f41362c0.setAlpha(floatValue);
                zVar.f41357a.invalidate();
                return;
            default:
                z zVar2 = this.f41252b;
                v vVar = zVar2.f41357a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !zVar2.L0) {
                    zVar2.f41391y0.setAlpha(1.0f);
                    zVar2.L0 = true;
                    vVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                zVar2.f41391y0.setRotationY(f10);
                vVar.d.setRotationY(f10);
                return;
        }
    }
}
