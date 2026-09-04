package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31059a;
    public final z20 f31060b;

    public v20(z20 z20Var, int i10) {
        this.f31059a = i10;
        this.f31060b = z20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31059a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var = this.f31060b;
                z20Var.f33065r.x = (int) floatValue;
                z20Var.h();
                x20 x20Var = z20Var.f33056a;
                if (x20Var.getParent() != null) {
                    z20Var.f33064n.updateViewLayout(x20Var, z20Var.f33065r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var2 = this.f31060b;
                z20Var2.f33065r.y = (int) floatValue2;
                x20 x20Var2 = z20Var2.f33056a;
                if (x20Var2.getParent() != null) {
                    z20Var2.f33064n.updateViewLayout(x20Var2, z20Var2.f33065r);
                    return;
                }
                return;
        }
    }
}
