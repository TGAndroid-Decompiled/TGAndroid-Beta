package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30869a;
    public final z2 f30870b;

    public x2(z2 z2Var, int i7) {
        this.f30869a = i7;
        this.f30870b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30869a) {
            case 0:
                z2 z2Var = this.f30870b;
                z2Var.getClass();
                z2Var.f30950a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.requestLayout();
                q0.a aVar = z2Var.f30952c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(z2Var.f30950a));
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30870b;
                z2Var2.getClass();
                z2Var2.f30950a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.requestLayout();
                q0.a aVar2 = z2Var2.f30952c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(z2Var2.f30950a));
                    return;
                }
                return;
        }
    }
}
