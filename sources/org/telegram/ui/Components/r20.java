package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32164a;
    public final w20 f32165b;

    public r20(w20 w20Var, int i10) {
        this.f32164a = i10;
        this.f32165b = w20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32164a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w20 w20Var = this.f32165b;
                w20Var.f34281r.x = (int) floatValue;
                w20Var.h();
                t20 t20Var = w20Var.f34275a;
                if (t20Var.getParent() != null) {
                    w20Var.f34280n.updateViewLayout(t20Var, w20Var.f34281r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w20 w20Var2 = this.f32165b;
                w20Var2.f34281r.y = (int) floatValue2;
                t20 t20Var2 = w20Var2.f34275a;
                if (t20Var2.getParent() != null) {
                    w20Var2.f34280n.updateViewLayout(t20Var2, w20Var2.f34281r);
                    return;
                }
                return;
        }
    }
}
