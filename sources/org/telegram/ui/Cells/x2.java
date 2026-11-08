package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30874a;
    public final z2 f30875b;

    public x2(z2 z2Var, int i7) {
        this.f30874a = i7;
        this.f30875b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30874a) {
            case 0:
                z2 z2Var = this.f30875b;
                z2Var.getClass();
                z2Var.f30955a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.requestLayout();
                q0.a aVar = z2Var.f30957c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(z2Var.f30955a));
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30875b;
                z2Var2.getClass();
                z2Var2.f30955a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.requestLayout();
                q0.a aVar2 = z2Var2.f30957c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(z2Var2.f30955a));
                    return;
                }
                return;
        }
    }
}
