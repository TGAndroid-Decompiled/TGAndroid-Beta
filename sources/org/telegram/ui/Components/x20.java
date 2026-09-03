package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30457a;
    public final b30 f30458b;

    public x20(b30 b30Var, int i10) {
        this.f30457a = i10;
        this.f30458b = b30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30457a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b30 b30Var = this.f30458b;
                b30Var.f23537r.x = (int) floatValue;
                b30Var.h();
                z20 z20Var = b30Var.f23532a;
                if (z20Var.getParent() != null) {
                    b30Var.f23536n.updateViewLayout(z20Var, b30Var.f23537r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b30 b30Var2 = this.f30458b;
                b30Var2.f23537r.y = (int) floatValue2;
                z20 z20Var2 = b30Var2.f23532a;
                if (z20Var2.getParent() != null) {
                    b30Var2.f23536n.updateViewLayout(z20Var2, b30Var2.f23537r);
                    return;
                }
                return;
        }
    }
}
