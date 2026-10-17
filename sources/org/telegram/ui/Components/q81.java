package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class q81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29592a;
    public final c91 f29593b;

    public q81(c91 c91Var, int i10) {
        this.f29592a = i10;
        this.f29593b = c91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29592a) {
            case 0:
                c91 c91Var = this.f29593b;
                c91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = c91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (c91Var.f25175y) {
                        c91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        c91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        c91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        c91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    c91Var.f25168c = floatValue;
                    c91Var.w(true);
                    s81 s81Var = c91Var.M;
                    if (s81Var != null) {
                        s81Var.v.invalidate();
                        c91Var.M.v.f1();
                        c91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c91 c91Var2 = this.f29593b;
                c91Var2.getClass();
                c91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                c91 c91Var3 = this.f29593b;
                c91Var3.N.onAnimationUpdate(valueAnimator);
                c91Var3.M.f24845a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c91Var3.M.v.f1();
                c91Var3.M.invalidate();
                return;
            default:
                c91 c91Var4 = this.f29593b;
                c91Var4.getClass();
                c91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
