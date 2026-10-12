package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class y81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31512a;
    public final k91 f31513b;

    public y81(k91 k91Var, int i10) {
        this.f31512a = i10;
        this.f31513b = k91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31512a) {
            case 0:
                k91 k91Var = this.f31513b;
                k91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = k91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (k91Var.f26648y) {
                        k91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        k91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        k91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        k91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    k91Var.f26641c = floatValue;
                    k91Var.w(true);
                    a91 a91Var = k91Var.M;
                    if (a91Var != null) {
                        a91Var.v.invalidate();
                        k91Var.M.v.f1();
                        k91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k91 k91Var2 = this.f31513b;
                k91Var2.getClass();
                k91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                k91 k91Var3 = this.f31513b;
                k91Var3.N.onAnimationUpdate(valueAnimator);
                k91Var3.M.f26273a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var3.M.v.f1();
                k91Var3.M.invalidate();
                return;
            default:
                k91 k91Var4 = this.f31513b;
                k91Var4.getClass();
                k91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
