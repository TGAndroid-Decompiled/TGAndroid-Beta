package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class l81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25972a;
    public final y81 f25973b;

    public l81(y81 y81Var, int i10) {
        this.f25972a = i10;
        this.f25973b = y81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25972a) {
            case 0:
                y81 y81Var = this.f25973b;
                y81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = y81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (y81Var.f30628y) {
                        y81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        y81Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        y81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        y81Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    y81Var.f30621c = floatValue;
                    y81Var.x(true);
                    n81 n81Var = y81Var.M;
                    if (n81Var != null) {
                        n81Var.v.invalidate();
                        y81Var.M.v.g1();
                        y81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y81 y81Var2 = this.f25973b;
                y81Var2.getClass();
                y81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                y81 y81Var3 = this.f25973b;
                y81Var3.N.onAnimationUpdate(valueAnimator);
                y81Var3.M.f30351a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y81Var3.M.v.g1();
                y81Var3.M.invalidate();
                return;
            default:
                y81 y81Var4 = this.f25973b;
                y81Var4.getClass();
                y81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
