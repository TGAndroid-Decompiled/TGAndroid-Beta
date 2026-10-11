package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class d91 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25496a;
    public final q91 f25497b;

    public d91(q91 q91Var, int i10) {
        this.f25496a = i10;
        this.f25497b = q91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25496a) {
            case 0:
                q91 q91Var = this.f25497b;
                q91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = q91Var.f30096e;
                View view = viewArr[1];
                if (view != null) {
                    if (q91Var.f30103y) {
                        q91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        q91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        q91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        q91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    q91Var.f30095c = floatValue;
                    q91Var.w(true);
                    f91 f91Var = q91Var.M;
                    if (f91Var != null) {
                        f91Var.v.invalidate();
                        q91Var.M.v.f1();
                        q91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q91 q91Var2 = this.f25497b;
                q91Var2.getClass();
                q91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                q91 q91Var3 = this.f25497b;
                q91Var3.N.onAnimationUpdate(valueAnimator);
                q91Var3.M.f29658a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q91Var3.M.v.f1();
                q91Var3.M.invalidate();
                return;
            default:
                q91 q91Var4 = this.f25497b;
                q91Var4.getClass();
                q91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
