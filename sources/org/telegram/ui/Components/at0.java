package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class at0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22719a;
    public final eu0 f22720b;
    public final lv0 f22721c;

    public at0(lv0 lv0Var, eu0 eu0Var, int i10) {
        this.f22719a = i10;
        this.f22721c = lv0Var;
        this.f22720b = eu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22719a) {
            case 0:
                this.f22721c.f26136n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22720b.h.invalidate();
                return;
            default:
                this.f22721c.f26136n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22720b.h.invalidate();
                return;
        }
    }
}
