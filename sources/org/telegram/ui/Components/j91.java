package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j91 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29576a;
    public final v91 f29577b;

    public j91(v91 v91Var, int i10) {
        this.f29576a = i10;
        this.f29577b = v91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29576a) {
            case 0:
                v91 v91Var = this.f29577b;
                v91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = v91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (v91Var.f33640y) {
                        v91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        v91Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        v91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        v91Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    v91Var.f33633c = floatValue;
                    v91Var.x(true);
                    l91 l91Var = v91Var.M;
                    if (l91Var != null) {
                        l91Var.v.invalidate();
                        v91Var.M.v.g1();
                        v91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v91 v91Var2 = this.f29577b;
                v91Var2.getClass();
                v91Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                v91 v91Var3 = this.f29577b;
                v91Var3.N.onAnimationUpdate(valueAnimator);
                v91Var3.M.f33296a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v91Var3.M.v.g1();
                v91Var3.M.invalidate();
                return;
            default:
                v91 v91Var4 = this.f29577b;
                v91Var4.getClass();
                v91Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
