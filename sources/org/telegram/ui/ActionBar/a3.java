package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18708a;
    public final c3 f18709b;

    public a3(c3 c3Var, int i10) {
        this.f18708a = i10;
        this.f18709b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f18708a) {
            case 0:
                c3 c3Var = this.f18709b;
                e3 e3Var = c3Var.G;
                e3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e3Var.onContainerViewTranslation();
                e3Var.onSmoothContainerViewLayout(e3Var.containerView.getTranslationY());
                c3Var.invalidate();
                return;
            case 1:
                c3 c3Var2 = this.f18709b;
                c3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var2.f18783y = floatValue;
                e3 e3Var2 = c3Var2.G;
                e3Var2.containerView.setTranslationX(floatValue);
                e3Var2.container.invalidate();
                return;
            case 2:
                c3 c3Var3 = this.f18709b;
                c3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var3.f18783y = floatValue2;
                e3 e3Var3 = c3Var3.G;
                e3Var3.containerView.setTranslationX(floatValue2);
                e3Var3.container.invalidate();
                return;
            case 3:
                c3 c3Var4 = this.f18709b;
                c3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var4 = c3Var4.G;
                d3 d3Var = e3Var4.backDrawable;
                if (e3Var4.dimBehind) {
                    i10 = (int) (e3Var4.dimBehindAlpha * floatValue3);
                } else {
                    i10 = 0;
                }
                d3Var.setAlpha(i10);
                return;
            default:
                e3 e3Var5 = this.f18709b.G;
                c3 c3Var5 = e3Var5.container;
                if (c3Var5 != null) {
                    c3Var5.invalidate();
                }
                e3Var5.onContainerViewTranslation();
                return;
        }
    }
}
