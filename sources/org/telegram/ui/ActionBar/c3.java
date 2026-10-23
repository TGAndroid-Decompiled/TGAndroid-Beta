package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20788a;
    public final e3 f20789b;

    public c3(e3 e3Var, int i10) {
        this.f20788a = i10;
        this.f20789b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f20788a) {
            case 0:
                e3 e3Var = this.f20789b;
                h3 h3Var = e3Var.G;
                h3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h3Var.onContainerViewTranslation();
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                e3Var.invalidate();
                return;
            case 1:
                e3 e3Var2 = this.f20789b;
                e3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var2.f20856y = floatValue;
                h3 h3Var2 = e3Var2.G;
                h3Var2.containerView.setTranslationX(floatValue);
                h3Var2.container.invalidate();
                return;
            case 2:
                e3 e3Var3 = this.f20789b;
                e3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var3.f20856y = floatValue2;
                h3 h3Var3 = e3Var3.G;
                h3Var3.containerView.setTranslationX(floatValue2);
                h3Var3.container.invalidate();
                return;
            case 3:
                e3 e3Var4 = this.f20789b;
                e3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var4 = e3Var4.G;
                g3 g3Var = h3Var4.backDrawable;
                if (h3Var4.dimBehind) {
                    i10 = (int) (h3Var4.dimBehindAlpha * floatValue3);
                } else {
                    i10 = 0;
                }
                g3Var.setAlpha(i10);
                return;
            default:
                h3 h3Var5 = this.f20789b.G;
                e3 e3Var5 = h3Var5.container;
                if (e3Var5 != null) {
                    e3Var5.invalidate();
                }
                h3Var5.onContainerViewTranslation();
                return;
        }
    }
}
