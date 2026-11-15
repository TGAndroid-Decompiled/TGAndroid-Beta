package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y30 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f41853a;
    public final u30 f41854b;
    public final r40 f41855c;

    public y30(r40 r40Var, boolean[] zArr, u30 u30Var) {
        this.f41855c = r40Var;
        this.f41853a = zArr;
        this.f41854b = u30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f41853a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f41854b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        r40 r40Var = this.f41855c;
        r40Var.f38847f.setRotationY(f10);
        r40Var.f38867r0.setRotationY(f10);
    }
}
