package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f28315a;
    public final b50 f28316b;
    public final s50 f28317c;

    public f50(s50 s50Var, boolean[] zArr, b50 b50Var) {
        this.f28317c = s50Var;
        this.f28315a = zArr;
        this.f28316b = b50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f28315a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f28316b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f9 = floatValue * 180.0f;
        s50 s50Var = this.f28317c;
        s50Var.f32495b.setRotationY(f9);
        s50Var.f32506i0.setRotationY(f9);
    }
}
