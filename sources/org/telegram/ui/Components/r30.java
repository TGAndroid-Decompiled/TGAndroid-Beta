package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r30 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f37617a;
    public final n30 f37618b;
    public final k40 f37619c;

    public r30(k40 k40Var, boolean[] zArr, n30 n30Var) {
        this.f37619c = k40Var;
        this.f37617a = zArr;
        this.f37618b = n30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f37617a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f37618b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        k40 k40Var = this.f37619c;
        k40Var.f35275f.setRotationY(f10);
        k40Var.f35295r0.setRotationY(f10);
    }
}
