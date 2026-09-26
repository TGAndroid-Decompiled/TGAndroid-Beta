package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.rr;
public final class t1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29623a;
    public final float f29624b;
    public final v1 f29625c;

    public t1(v1 v1Var, float f7, float f10) {
        this.f29625c = v1Var;
        this.f29623a = f7;
        this.f29624b = f10;
    }

    @Override
    public final boolean onPreDraw() {
        v1 v1Var = this.f29625c;
        if (!v1Var.P) {
            ValueAnimator valueAnimator = v1Var.f29695d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(v1Var.J, 0.0f);
            v1Var.f29695d0 = ofFloat;
            ofFloat.addUpdateListener(v1Var.f29696e0);
            v1Var.f29695d0.setDuration(300L);
            v1Var.f29695d0.start();
            float measuredWidth = this.f29623a - ((v1Var.getMeasuredWidth() - (v1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f29624b - ((v1Var.getMeasuredHeight() - (v1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            v1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            v1Var.setTranslationX(measuredWidth);
            v1Var.setTranslationY(measuredHeight);
            v1Var.setScaleX(0.23f);
            v1Var.setScaleY(0.23f);
            v1Var.animate().setListener(null).cancel();
            v1Var.animate().setListener(new q81(this, 8)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(rr.f28030f).start();
            return false;
        }
        v1Var.M = false;
        v1Var.requestLayout();
        return false;
    }
}
