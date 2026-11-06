package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class h61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34171a;
    public final u61 f34172b;

    public h61(u61 u61Var, int i7) {
        this.f34171a = i7;
        this.f34172b = u61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34171a) {
            case 0:
                u61 u61Var = this.f34172b;
                u61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = u61Var.f38534e;
                View view = viewArr[1];
                if (view != null) {
                    if (u61Var.D) {
                        u61Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        u61Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        u61Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        u61Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    u61Var.f38533c = floatValue;
                    u61Var.x(true);
                    j61 j61Var = u61Var.M;
                    if (j61Var != null) {
                        j61Var.f38267w.invalidate();
                        u61Var.M.f38267w.g1();
                        u61Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u61 u61Var2 = this.f34172b;
                u61Var2.getClass();
                u61Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                u61 u61Var3 = this.f34172b;
                u61Var3.N.onAnimationUpdate(valueAnimator);
                u61Var3.M.f38242a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var3.M.f38267w.g1();
                u61Var3.M.invalidate();
                return;
            default:
                u61 u61Var4 = this.f34172b;
                u61Var4.getClass();
                u61Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
