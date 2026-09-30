package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24222a;
    public final hg0 f24223b;

    public fg0(hg0 hg0Var, int i10) {
        this.f24222a = i10;
        this.f24223b = hg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24222a) {
            case 0:
                hg0 hg0Var = this.f24223b;
                hg0Var.getClass();
                hg0Var.f24805y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.invalidate();
                return;
            default:
                hg0 hg0Var2 = this.f24223b;
                hg0Var2.getClass();
                hg0Var2.f24805y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var2.invalidate();
                return;
        }
    }
}
