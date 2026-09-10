package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17646a;
    public final f3 f17647b;

    public d3(f3 f3Var, int i10) {
        this.f17646a = i10;
        this.f17647b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f17646a) {
            case 0:
                f3 f3Var = this.f17647b;
                h3 h3Var = f3Var.G;
                h3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h3Var.onContainerViewTranslation();
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                f3Var.invalidate();
                return;
            case 1:
                f3 f3Var2 = this.f17647b;
                f3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var2.f17713y = floatValue;
                h3 h3Var2 = f3Var2.G;
                h3Var2.containerView.setTranslationX(floatValue);
                h3Var2.container.invalidate();
                return;
            case 2:
                f3 f3Var3 = this.f17647b;
                f3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var3.f17713y = floatValue2;
                h3 h3Var3 = f3Var3.G;
                h3Var3.containerView.setTranslationX(floatValue2);
                h3Var3.container.invalidate();
                return;
            case 3:
                f3 f3Var4 = this.f17647b;
                f3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var4 = f3Var4.G;
                g3 g3Var = h3Var4.backDrawable;
                if (h3Var4.dimBehind) {
                    i10 = (int) (h3Var4.dimBehindAlpha * floatValue3);
                } else {
                    i10 = 0;
                }
                g3Var.setAlpha(i10);
                return;
            default:
                h3 h3Var5 = this.f17647b.G;
                f3 f3Var5 = h3Var5.container;
                if (f3Var5 != null) {
                    f3Var5.invalidate();
                }
                h3Var5.onContainerViewTranslation();
                return;
        }
    }
}
