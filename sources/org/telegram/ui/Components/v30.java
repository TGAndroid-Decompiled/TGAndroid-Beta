package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v30 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f38837a;
    public final r30 f38838b;
    public final o40 f38839c;

    public v30(o40 o40Var, boolean[] zArr, r30 r30Var) {
        this.f38839c = o40Var;
        this.f38837a = zArr;
        this.f38838b = r30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f38837a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f38838b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        o40 o40Var = this.f38839c;
        o40Var.f36545f.setRotationY(f10);
        o40Var.f36563q0.setRotationY(f10);
    }
}
