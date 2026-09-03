package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class z71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33832a;
    public final l81 f33833b;

    public z71(l81 l81Var, int i10) {
        this.f33832a = i10;
        this.f33833b = l81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33832a) {
            case 0:
                l81 l81Var = this.f33833b;
                l81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = l81Var.f28687e;
                View view = viewArr[1];
                if (view != null) {
                    if (l81Var.f28694y) {
                        l81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        l81Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        l81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        l81Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    l81Var.f28686c = floatValue;
                    l81Var.w(true);
                    b81 b81Var = l81Var.J;
                    if (b81Var != null) {
                        b81Var.v.invalidate();
                        l81Var.J.v.e1();
                        l81Var.J.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l81 l81Var2 = this.f33833b;
                l81Var2.getClass();
                l81Var2.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                l81 l81Var3 = this.f33833b;
                l81Var3.K.onAnimationUpdate(valueAnimator);
                l81Var3.J.f28322a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l81Var3.J.v.e1();
                l81Var3.J.invalidate();
                return;
            default:
                l81 l81Var4 = this.f33833b;
                l81Var4.getClass();
                l81Var4.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
