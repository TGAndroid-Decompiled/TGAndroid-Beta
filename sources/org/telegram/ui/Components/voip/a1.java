package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.s9;
public final class a1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f31373a;
    public final float f31374b;
    public final c1 f31375c;

    public a1(c1 c1Var, float f7, float f10) {
        this.f31375c = c1Var;
        this.f31373a = f7;
        this.f31374b = f10;
    }

    @Override
    public final boolean onPreDraw() {
        c1 c1Var = this.f31375c;
        if (!c1Var.P) {
            ValueAnimator valueAnimator = c1Var.f31408d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.J, 0.0f);
            c1Var.f31408d0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.f31409e0);
            c1Var.f31408d0.setDuration(300L);
            c1Var.f31408d0.start();
            float measuredWidth = this.f31373a - ((c1Var.getMeasuredWidth() - (c1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f31374b - ((c1Var.getMeasuredHeight() - (c1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            c1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            c1Var.setTranslationX(measuredWidth);
            c1Var.setTranslationY(measuredHeight);
            c1Var.setScaleX(0.23f);
            c1Var.setScaleY(0.23f);
            c1Var.animate().setListener(null).cancel();
            c1Var.animate().setListener(new s9(this, 26)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(gr.f26523f).start();
            return false;
        }
        c1Var.M = false;
        c1Var.requestLayout();
        return false;
    }
}
