package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25690a;
    public final v2 f25691b;

    public t2(v2 v2Var, int i10) {
        this.f25690a = i10;
        this.f25691b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25690a) {
            case 0:
                v2 v2Var = this.f25691b;
                v2Var.getClass();
                v2Var.f25821a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.requestLayout();
                q0.a aVar = v2Var.f25823c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(v2Var.f25821a));
                    return;
                }
                return;
            default:
                v2 v2Var2 = this.f25691b;
                v2Var2.getClass();
                v2Var2.f25821a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.requestLayout();
                q0.a aVar2 = v2Var2.f25823c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(v2Var2.f25821a));
                    return;
                }
                return;
        }
    }
}
