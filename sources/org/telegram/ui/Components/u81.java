package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class u81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31384a;
    public final h91 f31385b;

    public u81(h91 h91Var, int i10) {
        this.f31384a = i10;
        this.f31385b = h91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31384a) {
            case 0:
                h91 h91Var = this.f31385b;
                h91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = h91Var.f27168e;
                View view = viewArr[1];
                if (view != null) {
                    if (h91Var.f27175y) {
                        h91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        h91Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        h91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        h91Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    h91Var.f27167c = floatValue;
                    h91Var.x(true);
                    w81 w81Var = h91Var.M;
                    if (w81Var != null) {
                        w81Var.v.invalidate();
                        h91Var.M.v.g1();
                        h91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h91 h91Var2 = this.f31385b;
                h91Var2.getClass();
                h91Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                h91 h91Var3 = this.f31385b;
                h91Var3.N.onAnimationUpdate(valueAnimator);
                h91Var3.M.f26767a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h91Var3.M.v.g1();
                h91Var3.M.invalidate();
                return;
            default:
                h91 h91Var4 = this.f31385b;
                h91Var4.getClass();
                h91Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
