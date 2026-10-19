package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23625a;
    public final x2 f23626b;

    public v2(x2 x2Var, int i10) {
        this.f23625a = i10;
        this.f23626b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23625a) {
            case 0:
                x2 x2Var = this.f23626b;
                x2Var.getClass();
                x2Var.f23790a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.f23792c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.f23790a));
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f23626b;
                x2Var2.getClass();
                x2Var2.f23790a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.f23792c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.f23790a));
                    return;
                }
                return;
        }
    }
}
