package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class s81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30218a;
    public final e91 f30219b;

    public s81(e91 e91Var, int i10) {
        this.f30218a = i10;
        this.f30219b = e91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30218a) {
            case 0:
                e91 e91Var = this.f30219b;
                e91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = e91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (e91Var.f25870y) {
                        e91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        e91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        e91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        e91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    e91Var.f25863c = floatValue;
                    e91Var.w(true);
                    u81 u81Var = e91Var.M;
                    if (u81Var != null) {
                        u81Var.v.invalidate();
                        e91Var.M.v.f1();
                        e91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e91 e91Var2 = this.f30219b;
                e91Var2.getClass();
                e91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                e91 e91Var3 = this.f30219b;
                e91Var3.N.onAnimationUpdate(valueAnimator);
                e91Var3.M.f25391a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e91Var3.M.v.f1();
                e91Var3.M.invalidate();
                return;
            default:
                e91 e91Var4 = this.f30219b;
                e91Var4.getClass();
                e91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
