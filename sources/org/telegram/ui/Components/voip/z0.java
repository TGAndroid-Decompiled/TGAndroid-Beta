package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.s9;
public final class z0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f31793a;
    public final float f31794b;
    public final b1 f31795c;

    public z0(b1 b1Var, float f7, float f10) {
        this.f31795c = b1Var;
        this.f31793a = f7;
        this.f31794b = f10;
    }

    @Override
    public final boolean onPreDraw() {
        b1 b1Var = this.f31795c;
        if (!b1Var.P) {
            ValueAnimator valueAnimator = b1Var.f31328d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(b1Var.J, 0.0f);
            b1Var.f31328d0 = ofFloat;
            ofFloat.addUpdateListener(b1Var.f31329e0);
            b1Var.f31328d0.setDuration(300L);
            b1Var.f31328d0.start();
            float measuredWidth = this.f31793a - ((b1Var.getMeasuredWidth() - (b1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f31794b - ((b1Var.getMeasuredHeight() - (b1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            b1Var.setTranslationX(measuredWidth);
            b1Var.setTranslationY(measuredHeight);
            b1Var.setScaleX(0.23f);
            b1Var.setScaleY(0.23f);
            b1Var.animate().setListener(null).cancel();
            b1Var.animate().setListener(new s9(this, 26)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(gr.f26495f).start();
            return false;
        }
        b1Var.M = false;
        b1Var.requestLayout();
        return false;
    }
}
