package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22746a;
    public final d3 f22747b;

    public b3(d3 d3Var, int i9) {
        this.f22746a = i9;
        this.f22747b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9;
        switch (this.f22746a) {
            case 0:
                d3 d3Var = this.f22747b;
                f3 f3Var = d3Var.C;
                f3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.onContainerViewTranslation();
                f3Var.onSmoothContainerViewLayout(f3Var.containerView.getTranslationY());
                d3Var.invalidate();
                return;
            case 1:
                d3 d3Var2 = this.f22747b;
                d3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var2.f22841y = floatValue;
                f3 f3Var2 = d3Var2.C;
                f3Var2.containerView.setTranslationX(floatValue);
                f3Var2.container.invalidate();
                return;
            case 2:
                d3 d3Var3 = this.f22747b;
                d3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var3.f22841y = floatValue2;
                f3 f3Var3 = d3Var3.C;
                f3Var3.containerView.setTranslationX(floatValue2);
                f3Var3.container.invalidate();
                return;
            case 3:
                d3 d3Var4 = this.f22747b;
                d3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var4 = d3Var4.C;
                e3 e3Var = f3Var4.backDrawable;
                if (f3Var4.dimBehind) {
                    i9 = (int) (f3Var4.dimBehindAlpha * floatValue3);
                } else {
                    i9 = 0;
                }
                e3Var.setAlpha(i9);
                return;
            default:
                f3 f3Var5 = this.f22747b.C;
                d3 d3Var5 = f3Var5.container;
                if (d3Var5 != null) {
                    d3Var5.invalidate();
                }
                f3Var5.onContainerViewTranslation();
                return;
        }
    }
}
