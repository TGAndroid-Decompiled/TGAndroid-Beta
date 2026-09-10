package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f26586a;
    public final n50 f26587b;
    public final f60 f26588c;

    public r50(f60 f60Var, boolean[] zArr, n50 n50Var) {
        this.f26588c = f60Var;
        this.f26586a = zArr;
        this.f26587b = n50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f26586a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f26587b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        f60 f60Var = this.f26588c;
        f60Var.f22876b.setRotationY(f7);
        f60Var.m0.setRotationY(f7);
    }
}
