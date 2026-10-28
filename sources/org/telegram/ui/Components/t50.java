package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f32867a;
    public final p50 f32868b;
    public final p60 f32869c;

    public t50(p60 p60Var, boolean[] zArr, p50 p50Var) {
        this.f32869c = p60Var;
        this.f32867a = zArr;
        this.f32868b = p50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f32867a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f32868b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        p60 p60Var = this.f32869c;
        p60Var.f31477f.setRotationY(f7);
        p60Var.f31495q0.setRotationY(f7);
    }
}
