package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v30 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f38802a;
    public final r30 f38803b;
    public final o40 f38804c;

    public v30(o40 o40Var, boolean[] zArr, r30 r30Var) {
        this.f38804c = o40Var;
        this.f38802a = zArr;
        this.f38803b = r30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f38802a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f38803b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        o40 o40Var = this.f38804c;
        o40Var.f36525f.setRotationY(f10);
        o40Var.f36543q0.setRotationY(f10);
    }
}
