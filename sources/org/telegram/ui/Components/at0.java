package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class at0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22722a;
    public final eu0 f22723b;
    public final lv0 f22724c;

    public at0(lv0 lv0Var, eu0 eu0Var, int i10) {
        this.f22722a = i10;
        this.f22724c = lv0Var;
        this.f22723b = eu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22722a) {
            case 0:
                this.f22724c.f26142n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22723b.h.invalidate();
                return;
            default:
                this.f22724c.f26142n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22723b.h.invalidate();
                return;
        }
    }
}
