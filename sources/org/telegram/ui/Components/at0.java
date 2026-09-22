package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class at0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22735a;
    public final eu0 f22736b;
    public final lv0 f22737c;

    public at0(lv0 lv0Var, eu0 eu0Var, int i10) {
        this.f22735a = i10;
        this.f22737c = lv0Var;
        this.f22736b = eu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22735a) {
            case 0:
                this.f22737c.f26216n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22736b.h.invalidate();
                return;
            default:
                this.f22737c.f26216n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f22736b.h.invalidate();
                return;
        }
    }
}
