package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class h91 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26708a;
    public final u91 f26709b;

    public h91(u91 u91Var, int i10) {
        this.f26708a = i10;
        this.f26709b = u91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26708a) {
            case 0:
                u91 u91Var = this.f26709b;
                u91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = u91Var.f31109e;
                View view = viewArr[1];
                if (view != null) {
                    if (u91Var.f31116y) {
                        u91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        u91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        u91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        u91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    u91Var.f31108c = floatValue;
                    u91Var.w(true);
                    j91 j91Var = u91Var.M;
                    if (j91Var != null) {
                        j91Var.v.invalidate();
                        u91Var.M.v.f1();
                        u91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u91 u91Var2 = this.f26709b;
                u91Var2.getClass();
                u91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                u91 u91Var3 = this.f26709b;
                u91Var3.N.onAnimationUpdate(valueAnimator);
                u91Var3.M.f30803a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u91Var3.M.v.f1();
                u91Var3.M.invalidate();
                return;
            default:
                u91 u91Var4 = this.f26709b;
                u91Var4.getClass();
                u91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
