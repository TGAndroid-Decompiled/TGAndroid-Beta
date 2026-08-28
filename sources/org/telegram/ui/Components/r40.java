package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r40 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f32078a;
    public final n40 f32079b;
    public final f50 f32080c;

    public r40(f50 f50Var, boolean[] zArr, n40 n40Var) {
        this.f32080c = f50Var;
        this.f32078a = zArr;
        this.f32079b = n40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f32078a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f32079b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        f50 f50Var = this.f32080c;
        f50Var.f28274b.setRotationY(f10);
        f50Var.f28285i0.setRotationY(f10);
    }
}
