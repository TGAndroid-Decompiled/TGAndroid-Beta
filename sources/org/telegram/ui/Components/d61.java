package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class d61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32771a;
    public final p61 f32772b;

    public d61(p61 p61Var, int i7) {
        this.f32771a = i7;
        this.f32772b = p61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32771a) {
            case 0:
                p61 p61Var = this.f32772b;
                p61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = p61Var.f36906e;
                View view = viewArr[1];
                if (view != null) {
                    if (p61Var.D) {
                        p61Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        p61Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        p61Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        p61Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    p61Var.f36905c = floatValue;
                    p61Var.x(true);
                    f61 f61Var = p61Var.M;
                    if (f61Var != null) {
                        f61Var.f36665w.invalidate();
                        p61Var.M.f36665w.g1();
                        p61Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p61 p61Var2 = this.f32772b;
                p61Var2.getClass();
                p61Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                p61 p61Var3 = this.f32772b;
                p61Var3.N.onAnimationUpdate(valueAnimator);
                p61Var3.M.f36640a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var3.M.f36665w.g1();
                p61Var3.M.invalidate();
                return;
            default:
                p61 p61Var4 = this.f32772b;
                p61Var4.getClass();
                p61Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
