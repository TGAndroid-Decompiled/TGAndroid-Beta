package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f32856a;
    public final p50 f32857b;
    public final o60 f32858c;

    public t50(o60 o60Var, boolean[] zArr, p50 p50Var) {
        this.f32858c = o60Var;
        this.f32856a = zArr;
        this.f32857b = p50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f32856a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f32857b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        o60 o60Var = this.f32858c;
        o60Var.h.setRotationY(f7);
        o60Var.f31196r0.setRotationY(f7);
    }
}
