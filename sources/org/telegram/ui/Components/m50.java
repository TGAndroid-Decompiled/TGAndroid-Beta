package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f28983a;
    public final h50 f28984b;
    public final z50 f28985c;

    public m50(z50 z50Var, boolean[] zArr, h50 h50Var) {
        this.f28985c = z50Var;
        this.f28983a = zArr;
        this.f28984b = h50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f28983a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f28984b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        z50 z50Var = this.f28985c;
        z50Var.f33772b.setRotationY(f10);
        z50Var.f33784j0.setRotationY(f10);
    }
}
