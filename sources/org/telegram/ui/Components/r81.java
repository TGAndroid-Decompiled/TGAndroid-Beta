package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class r81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29884a;
    public final d91 f29885b;

    public r81(d91 d91Var, int i10) {
        this.f29884a = i10;
        this.f29885b = d91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29884a) {
            case 0:
                d91 d91Var = this.f29885b;
                d91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = d91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (d91Var.f25509y) {
                        d91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        d91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        d91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        d91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    d91Var.f25502c = floatValue;
                    d91Var.w(true);
                    t81 t81Var = d91Var.M;
                    if (t81Var != null) {
                        t81Var.v.invalidate();
                        d91Var.M.v.f1();
                        d91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                d91 d91Var2 = this.f29885b;
                d91Var2.getClass();
                d91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                d91 d91Var3 = this.f29885b;
                d91Var3.N.onAnimationUpdate(valueAnimator);
                d91Var3.M.f25127a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var3.M.v.f1();
                d91Var3.M.invalidate();
                return;
            default:
                d91 d91Var4 = this.f29885b;
                d91Var4.getClass();
                d91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
