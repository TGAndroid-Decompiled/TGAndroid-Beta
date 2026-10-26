package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22622a;
    public final h3 f22623b;

    public f3(h3 h3Var, int i10) {
        this.f22622a = i10;
        this.f22623b = h3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f22622a) {
            case 0:
                h3 h3Var = this.f22623b;
                k3 k3Var = h3Var.G;
                k3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k3Var.onContainerViewTranslation();
                k3Var.onSmoothContainerViewLayout(k3Var.containerView.getTranslationY());
                h3Var.invalidate();
                return;
            case 1:
                h3 h3Var2 = this.f22623b;
                h3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var2.f22681y = floatValue;
                k3 k3Var2 = h3Var2.G;
                k3Var2.containerView.setTranslationX(floatValue);
                k3Var2.container.invalidate();
                return;
            case 2:
                h3 h3Var3 = this.f22623b;
                h3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var3.f22681y = floatValue2;
                k3 k3Var3 = h3Var3.G;
                k3Var3.containerView.setTranslationX(floatValue2);
                k3Var3.container.invalidate();
                return;
            case 3:
                h3 h3Var4 = this.f22623b;
                h3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3 k3Var4 = h3Var4.G;
                j3 j3Var = k3Var4.backDrawable;
                if (k3Var4.dimBehind) {
                    i10 = (int) (k3Var4.dimBehindAlpha * floatValue3);
                } else {
                    i10 = 0;
                }
                j3Var.setAlpha(i10);
                return;
            default:
                k3 k3Var5 = this.f22623b.G;
                h3 h3Var5 = k3Var5.container;
                if (h3Var5 != null) {
                    h3Var5.invalidate();
                }
                k3Var5.onContainerViewTranslation();
                return;
        }
    }
}
