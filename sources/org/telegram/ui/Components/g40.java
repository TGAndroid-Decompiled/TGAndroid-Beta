package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g40 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f35310a;
    public final c40 f35311b;
    public final z40 f35312c;

    public g40(z40 z40Var, boolean[] zArr, c40 c40Var) {
        this.f35312c = z40Var;
        this.f35310a = zArr;
        this.f35311b = c40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f35310a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f35311b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        z40 z40Var = this.f35312c;
        z40Var.f42668f.setRotationY(f10);
        z40Var.f42688r0.setRotationY(f10);
    }
}
