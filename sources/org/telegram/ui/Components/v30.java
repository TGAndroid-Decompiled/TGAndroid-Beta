package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v30 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f38810a;
    public final r30 f38811b;
    public final o40 f38812c;

    public v30(o40 o40Var, boolean[] zArr, r30 r30Var) {
        this.f38812c = o40Var;
        this.f38810a = zArr;
        this.f38811b = r30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f38810a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f38811b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        o40 o40Var = this.f38812c;
        o40Var.f36483f.setRotationY(f10);
        o40Var.f36501q0.setRotationY(f10);
    }
}
