package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24313a;
    public final v81 f24314b;

    public j81(v81 v81Var, int i10) {
        this.f24313a = i10;
        this.f24314b = v81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24313a) {
            case 0:
                v81 v81Var = this.f24314b;
                v81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = v81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (v81Var.f27894y) {
                        v81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        v81Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        v81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        v81Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    v81Var.f27887c = floatValue;
                    v81Var.w(true);
                    l81 l81Var = v81Var.M;
                    if (l81Var != null) {
                        l81Var.v.invalidate();
                        v81Var.M.v.e1();
                        v81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v81 v81Var2 = this.f24314b;
                v81Var2.getClass();
                v81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                v81 v81Var3 = this.f24314b;
                v81Var3.N.onAnimationUpdate(valueAnimator);
                v81Var3.M.f27614a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v81Var3.M.v.e1();
                v81Var3.M.invalidate();
                return;
            default:
                v81 v81Var4 = this.f24314b;
                v81Var4.getClass();
                v81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
