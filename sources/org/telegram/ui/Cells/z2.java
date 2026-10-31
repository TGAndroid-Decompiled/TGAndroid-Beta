package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23636a;
    public final b3 f23637b;

    public z2(b3 b3Var, int i10) {
        this.f23636a = i10;
        this.f23637b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23636a) {
            case 0:
                b3 b3Var = this.f23637b;
                b3Var.getClass();
                b3Var.f21710a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.requestLayout();
                q0.a aVar = b3Var.f21712c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(b3Var.f21710a));
                    return;
                }
                return;
            default:
                b3 b3Var2 = this.f23637b;
                b3Var2.getClass();
                b3Var2.f21710a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.requestLayout();
                q0.a aVar2 = b3Var2.f21712c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(b3Var2.f21710a));
                    return;
                }
                return;
        }
    }
}
