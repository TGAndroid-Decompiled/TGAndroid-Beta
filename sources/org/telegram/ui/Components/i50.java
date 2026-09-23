package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24878a;
    public final e50 f24879b;
    public final x50 f24880c;

    public i50(x50 x50Var, boolean[] zArr, e50 e50Var) {
        this.f24880c = x50Var;
        this.f24878a = zArr;
        this.f24879b = e50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24878a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24879b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        x50 x50Var = this.f24880c;
        x50Var.f29891b.setRotationY(f7);
        x50Var.m0.setRotationY(f7);
    }
}
