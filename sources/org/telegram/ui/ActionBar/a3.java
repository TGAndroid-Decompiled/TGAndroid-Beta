package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class a3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f22708a;

    public final c3 f22709b;

    public a3(c3 c3Var, int i10) {
        this.f22708a = i10;
        this.f22709b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22708a) {
            case 0:
                c3 c3Var = this.f22709b;
                e3 e3Var = c3Var.C;
                e3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e3Var.onContainerViewTranslation();
                e3Var.onSmoothContainerViewLayout(e3Var.containerView.getTranslationY());
                c3Var.invalidate();
                break;
            case 1:
                c3 c3Var2 = this.f22709b;
                c3Var2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var2.f22817y = fFloatValue;
                e3 e3Var2 = c3Var2.C;
                e3Var2.containerView.setTranslationX(fFloatValue);
                e3Var2.container.invalidate();
                break;
            case 2:
                c3 c3Var3 = this.f22709b;
                c3Var3.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var3.f22817y = fFloatValue2;
                e3 e3Var3 = c3Var3.C;
                e3Var3.containerView.setTranslationX(fFloatValue2);
                e3Var3.container.invalidate();
                break;
            case 3:
                c3 c3Var4 = this.f22709b;
                c3Var4.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var4 = c3Var4.C;
                e3Var4.backDrawable.setAlpha(e3Var4.dimBehind ? (int) (e3Var4.dimBehindAlpha * fFloatValue3) : 0);
                break;
            default:
                e3 e3Var5 = this.f22709b.C;
                c3 c3Var5 = e3Var5.container;
                if (c3Var5 != null) {
                    c3Var5.invalidate();
                }
                e3Var5.onContainerViewTranslation();
                break;
        }
    }
}
