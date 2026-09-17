package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21472a;
    public final x2 f21473b;

    public v2(x2 x2Var, int i10) {
        this.f21472a = i10;
        this.f21473b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21472a) {
            case 0:
                x2 x2Var = this.f21473b;
                x2Var.getClass();
                x2Var.f21621a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.f21623c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.f21621a));
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f21473b;
                x2Var2.getClass();
                x2Var2.f21621a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.f21623c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.f21621a));
                    return;
                }
                return;
        }
    }
}
