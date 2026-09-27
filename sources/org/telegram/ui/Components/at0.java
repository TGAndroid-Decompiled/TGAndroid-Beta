package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class at0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22758a;
    public final eu0 f22759b;
    public final lv0 f22760c;

    public at0(lv0 lv0Var, eu0 eu0Var, int i10) {
        this.f22758a = i10;
        this.f22760c = lv0Var;
        this.f22759b = eu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22758a) {
            case 0:
                this.f22760c.f26194n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22759b.h.invalidate();
                return;
            default:
                this.f22760c.f26194n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22759b.h.invalidate();
                return;
        }
    }
}
