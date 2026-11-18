package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g40 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f35324a;
    public final c40 f35325b;
    public final z40 f35326c;

    public g40(z40 z40Var, boolean[] zArr, c40 c40Var) {
        this.f35326c = z40Var;
        this.f35324a = zArr;
        this.f35325b = c40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f35324a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f35325b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        z40 z40Var = this.f35326c;
        z40Var.f42773f.setRotationY(f10);
        z40Var.f42793r0.setRotationY(f10);
    }
}
