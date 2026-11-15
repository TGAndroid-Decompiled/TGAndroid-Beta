package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f40949a;
    public final z f40950b;

    public t(z zVar, int i7) {
        this.f40949a = i7;
        this.f40950b = zVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f40949a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z zVar = this.f40950b;
                zVar.f41081b0 = floatValue;
                zVar.f41083c0.setAlpha(floatValue);
                zVar.f41078a.invalidate();
                return;
            default:
                z zVar2 = this.f40950b;
                v vVar = zVar2.f41078a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !zVar2.L0) {
                    zVar2.f41112y0.setAlpha(1.0f);
                    zVar2.L0 = true;
                    vVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                zVar2.f41112y0.setRotationY(f10);
                vVar.d.setRotationY(f10);
                return;
        }
    }
}
