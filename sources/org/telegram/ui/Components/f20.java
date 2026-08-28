package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28237a;
    public final j20 f28238b;

    public f20(j20 j20Var, int i9) {
        this.f28237a = i9;
        this.f28238b = j20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28237a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j20 j20Var = this.f28238b;
                j20Var.f29604r.x = (int) floatValue;
                j20Var.h();
                h20 h20Var = j20Var.f29598a;
                if (h20Var.getParent() != null) {
                    j20Var.f29603n.updateViewLayout(h20Var, j20Var.f29604r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j20 j20Var2 = this.f28238b;
                j20Var2.f29604r.y = (int) floatValue2;
                h20 h20Var2 = j20Var2.f29598a;
                if (h20Var2.getParent() != null) {
                    j20Var2.f29603n.updateViewLayout(h20Var2, j20Var2.f29604r);
                    return;
                }
                return;
        }
    }
}
