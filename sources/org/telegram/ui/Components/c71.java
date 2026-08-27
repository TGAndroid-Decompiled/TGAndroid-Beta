package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

public final class c71 implements ValueAnimator.AnimatorUpdateListener {

    public final int f27355a;

    public final p71 f27356b;

    public c71(p71 p71Var, int i10) {
        this.f27355a = i10;
        this.f27356b = p71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27355a) {
            case 0:
                p71 p71Var = this.f27356b;
                p71Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = p71Var.f31545e;
                View view = viewArr[1];
                if (view != null) {
                    if (p71Var.f31552y) {
                        p71Var.E(view, (1.0f - fFloatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        p71Var.E(view2, (-view2.getMeasuredWidth()) * fFloatValue);
                    } else {
                        p71Var.E(view, (1.0f - fFloatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        p71Var.E(view3, view3.getMeasuredWidth() * fFloatValue);
                    }
                    p71Var.f31544c = fFloatValue;
                    p71Var.w(true);
                    e71 e71Var = p71Var.I;
                    if (e71Var != null) {
                        e71Var.v.invalidate();
                        p71Var.I.v.f1();
                        p71Var.I.invalidate();
                    }
                    break;
                }
                break;
            case 1:
                p71 p71Var2 = this.f27356b;
                p71Var2.getClass();
                p71Var2.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                p71 p71Var3 = this.f27356b;
                p71Var3.J.onAnimationUpdate(valueAnimator);
                p71Var3.I.f31204a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p71Var3.I.v.f1();
                p71Var3.I.invalidate();
                break;
            default:
                p71 p71Var4 = this.f27356b;
                p71Var4.getClass();
                p71Var4.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
