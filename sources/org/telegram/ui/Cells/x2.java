package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30889a;
    public final z2 f30890b;

    public x2(z2 z2Var, int i7) {
        this.f30889a = i7;
        this.f30890b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30889a) {
            case 0:
                z2 z2Var = this.f30890b;
                z2Var.getClass();
                z2Var.f30971a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.requestLayout();
                q0.a aVar = z2Var.f30973c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(z2Var.f30971a));
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30890b;
                z2Var2.getClass();
                z2Var2.f30971a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.requestLayout();
                q0.a aVar2 = z2Var2.f30973c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(z2Var2.f30971a));
                    return;
                }
                return;
        }
    }
}
