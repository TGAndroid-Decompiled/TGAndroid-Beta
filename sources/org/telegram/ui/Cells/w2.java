package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21752a;
    public final y2 f21753b;

    public w2(y2 y2Var, int i10) {
        this.f21752a = i10;
        this.f21753b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21752a) {
            case 0:
                y2 y2Var = this.f21753b;
                y2Var.getClass();
                y2Var.f21831a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.requestLayout();
                q0.a aVar = y2Var.f21833c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(y2Var.f21831a));
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f21753b;
                y2Var2.getClass();
                y2Var2.f21831a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.requestLayout();
                q0.a aVar2 = y2Var2.f21833c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(y2Var2.f21831a));
                    return;
                }
                return;
        }
    }
}
