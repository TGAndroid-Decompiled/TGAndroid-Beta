package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class v71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28685a;
    public final h81 f28686b;

    public v71(h81 h81Var, int i10) {
        this.f28685a = i10;
        this.f28686b = h81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28685a) {
            case 0:
                h81 h81Var = this.f28686b;
                h81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = h81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (h81Var.f24577y) {
                        h81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        h81Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        h81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        h81Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    h81Var.f24570c = floatValue;
                    h81Var.w(true);
                    x71 x71Var = h81Var.M;
                    if (x71Var != null) {
                        x71Var.v.invalidate();
                        h81Var.M.v.f1();
                        h81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h81 h81Var2 = this.f28686b;
                h81Var2.getClass();
                h81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                h81 h81Var3 = this.f28686b;
                h81Var3.N.onAnimationUpdate(valueAnimator);
                h81Var3.M.f24208a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var3.M.v.f1();
                h81Var3.M.invalidate();
                return;
            default:
                h81 h81Var4 = this.f28686b;
                h81Var4.getClass();
                h81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
