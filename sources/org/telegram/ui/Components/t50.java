package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f32859a;
    public final p50 f32860b;
    public final o60 f32861c;

    public t50(o60 o60Var, boolean[] zArr, p50 p50Var) {
        this.f32861c = o60Var;
        this.f32859a = zArr;
        this.f32860b = p50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f32859a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f32860b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        o60 o60Var = this.f32861c;
        o60Var.h.setRotationY(f7);
        o60Var.f31198r0.setRotationY(f7);
    }
}
