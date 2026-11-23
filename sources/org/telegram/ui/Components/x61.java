package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class x61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41986a;
    public final j71 f41987b;

    public x61(j71 j71Var, int i7) {
        this.f41986a = i7;
        this.f41987b = j71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41986a) {
            case 0:
                j71 j71Var = this.f41987b;
                j71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = j71Var.f36434e;
                View view = viewArr[1];
                if (view != null) {
                    if (j71Var.E) {
                        j71Var.B(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        j71Var.B(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        j71Var.B(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        j71Var.B(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    j71Var.f36433c = floatValue;
                    j71Var.t(true);
                    z61 z61Var = j71Var.N;
                    if (z61Var != null) {
                        z61Var.f36219w.invalidate();
                        j71Var.N.f36219w.g1();
                        j71Var.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j71 j71Var2 = this.f41987b;
                j71Var2.getClass();
                j71Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                j71 j71Var3 = this.f41987b;
                j71Var3.O.onAnimationUpdate(valueAnimator);
                j71Var3.N.f36193a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var3.N.f36219w.g1();
                j71Var3.N.invalidate();
                return;
            default:
                j71 j71Var4 = this.f41987b;
                j71Var4.getClass();
                j71Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
