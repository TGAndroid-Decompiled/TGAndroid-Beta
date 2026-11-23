package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42280a;
    public final c20 f42281b;

    public y10(c20 c20Var, int i7) {
        this.f42280a = i7;
        this.f42281b = c20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42280a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c20 c20Var = this.f42281b;
                c20Var.f33959s.x = (int) floatValue;
                c20Var.i();
                a20 a20Var = c20Var.f33947a;
                if (a20Var.getParent() != null) {
                    c20Var.f33957n.updateViewLayout(a20Var, c20Var.f33959s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c20 c20Var2 = this.f42281b;
                c20Var2.f33959s.y = (int) floatValue2;
                a20 a20Var2 = c20Var2.f33947a;
                if (a20Var2.getParent() != null) {
                    c20Var2.f33957n.updateViewLayout(a20Var2, c20Var2.f33959s);
                    return;
                }
                return;
        }
    }
}
