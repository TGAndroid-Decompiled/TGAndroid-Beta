package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23649a;
    public final y2 f23650b;

    public w2(y2 y2Var, int i10) {
        this.f23649a = i10;
        this.f23650b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23649a) {
            case 0:
                y2 y2Var = this.f23650b;
                y2Var.getClass();
                y2Var.f23749a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.requestLayout();
                q0.a aVar = y2Var.f23751c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(y2Var.f23749a));
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f23650b;
                y2Var2.getClass();
                y2Var2.f23749a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.requestLayout();
                q0.a aVar2 = y2Var2.f23751c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(y2Var2.f23749a));
                    return;
                }
                return;
        }
    }
}
