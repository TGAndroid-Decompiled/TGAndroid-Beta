package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18527a;
    public final e3 f18528b;

    public c3(e3 e3Var, int i10) {
        this.f18527a = i10;
        this.f18528b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f18527a) {
            case 0:
                e3 e3Var = this.f18528b;
                g3 g3Var = e3Var.G;
                g3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                g3Var.onContainerViewTranslation();
                g3Var.onSmoothContainerViewLayout(g3Var.containerView.getTranslationY());
                e3Var.invalidate();
                return;
            case 1:
                e3 e3Var2 = this.f18528b;
                e3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var2.f18616y = floatValue;
                g3 g3Var2 = e3Var2.G;
                g3Var2.containerView.setTranslationX(floatValue);
                g3Var2.container.invalidate();
                return;
            case 2:
                e3 e3Var3 = this.f18528b;
                e3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var3.f18616y = floatValue2;
                g3 g3Var3 = e3Var3.G;
                g3Var3.containerView.setTranslationX(floatValue2);
                g3Var3.container.invalidate();
                return;
            case 3:
                e3 e3Var4 = this.f18528b;
                e3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3 g3Var4 = e3Var4.G;
                f3 f3Var = g3Var4.backDrawable;
                if (g3Var4.dimBehind) {
                    i10 = (int) (g3Var4.dimBehindAlpha * floatValue3);
                } else {
                    i10 = 0;
                }
                f3Var.setAlpha(i10);
                return;
            default:
                g3 g3Var5 = this.f18528b.G;
                e3 e3Var5 = g3Var5.container;
                if (e3Var5 != null) {
                    e3Var5.invalidate();
                }
                g3Var5.onContainerViewTranslation();
                return;
        }
    }
}
