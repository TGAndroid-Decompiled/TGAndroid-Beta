package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class m71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30592a;
    public final z71 f30593b;

    public m71(z71 z71Var, int i10) {
        this.f30592a = i10;
        this.f30593b = z71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30592a) {
            case 0:
                z71 z71Var = this.f30593b;
                z71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = z71Var.f35261e;
                View view = viewArr[1];
                if (view != null) {
                    if (z71Var.f35268y) {
                        z71Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        z71Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        z71Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        z71Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    z71Var.f35260c = floatValue;
                    z71Var.w(true);
                    o71 o71Var = z71Var.I;
                    if (o71Var != null) {
                        o71Var.v.invalidate();
                        z71Var.I.v.f1();
                        z71Var.I.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                z71 z71Var2 = this.f30593b;
                z71Var2.getClass();
                z71Var2.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                z71 z71Var3 = this.f30593b;
                z71Var3.J.onAnimationUpdate(valueAnimator);
                z71Var3.I.f34940a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z71Var3.I.v.f1();
                z71Var3.I.invalidate();
                return;
            default:
                z71 z71Var4 = this.f30593b;
                z71Var4.getClass();
                z71Var4.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
