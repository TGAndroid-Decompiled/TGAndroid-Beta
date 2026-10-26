package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29765a;
    public final q00 f29766b;

    public k00(q00 q00Var, int i10) {
        this.f29765a = i10;
        this.f29766b = q00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29765a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00 q00Var = this.f29766b;
                q00Var.f31774x = floatValue;
                q00Var.invalidate();
                return;
            default:
                q00 q00Var2 = this.f29766b;
                q00Var2.getClass();
                q00Var2.f31775y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00Var2.invalidate();
                return;
        }
    }
}
