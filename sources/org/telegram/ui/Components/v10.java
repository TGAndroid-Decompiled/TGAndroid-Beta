package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40473a;
    public final z10 f40474b;

    public v10(z10 z10Var, int i7) {
        this.f40473a = i7;
        this.f40474b = z10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40473a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z10 z10Var = this.f40474b;
                z10Var.f42724s.x = (int) floatValue;
                z10Var.i();
                x10 x10Var = z10Var.f42712a;
                if (x10Var.getParent() != null) {
                    z10Var.f42722n.updateViewLayout(x10Var, z10Var.f42724s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z10 z10Var2 = this.f40474b;
                z10Var2.f42724s.y = (int) floatValue2;
                x10 x10Var2 = z10Var2.f42712a;
                if (x10Var2.getParent() != null) {
                    z10Var2.f42722n.updateViewLayout(x10Var2, z10Var2.f42724s);
                    return;
                }
                return;
        }
    }
}
