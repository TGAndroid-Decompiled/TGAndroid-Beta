package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30878a;
    public final z2 f30879b;

    public x2(z2 z2Var, int i7) {
        this.f30878a = i7;
        this.f30879b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30878a) {
            case 0:
                z2 z2Var = this.f30879b;
                z2Var.getClass();
                z2Var.f30960a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.requestLayout();
                q0.a aVar = z2Var.f30962c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(z2Var.f30960a));
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30879b;
                z2Var2.getClass();
                z2Var2.f30960a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.requestLayout();
                q0.a aVar2 = z2Var2.f30962c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(z2Var2.f30960a));
                    return;
                }
                return;
        }
    }
}
