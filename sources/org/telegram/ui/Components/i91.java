package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class i91 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29237a;
    public final u91 f29238b;

    public i91(u91 u91Var, int i10) {
        this.f29237a = i10;
        this.f29238b = u91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29237a) {
            case 0:
                u91 u91Var = this.f29238b;
                u91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = u91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (u91Var.f33325y) {
                        u91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        u91Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        u91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        u91Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    u91Var.f33318c = floatValue;
                    u91Var.x(true);
                    k91 k91Var = u91Var.M;
                    if (k91Var != null) {
                        k91Var.v.invalidate();
                        u91Var.M.v.g1();
                        u91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u91 u91Var2 = this.f29238b;
                u91Var2.getClass();
                u91Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                u91 u91Var3 = this.f29238b;
                u91Var3.N.onAnimationUpdate(valueAnimator);
                u91Var3.M.f32922a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u91Var3.M.v.g1();
                u91Var3.M.invalidate();
                return;
            default:
                u91 u91Var4 = this.f29238b;
                u91Var4.getClass();
                u91Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
