package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f26161a;
    public final f50 f26162b;
    public final x50 f26163c;

    public k50(x50 x50Var, boolean[] zArr, f50 f50Var) {
        this.f26163c = x50Var;
        this.f26161a = zArr;
        this.f26162b = f50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f26161a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f26162b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        x50 x50Var = this.f26163c;
        x50Var.f30548b.setRotationY(f10);
        x50Var.f30559j0.setRotationY(f10);
    }
}
