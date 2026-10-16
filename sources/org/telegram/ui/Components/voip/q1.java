package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.v61;
public final class q1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f30078a;
    public final float f30079b;
    public final s1 f30080c;

    public q1(s1 s1Var, float f7, float f10) {
        this.f30080c = s1Var;
        this.f30078a = f7;
        this.f30079b = f10;
    }

    @Override
    public final boolean onPreDraw() {
        s1 s1Var = this.f30080c;
        if (!s1Var.P) {
            ValueAnimator valueAnimator = s1Var.f30124d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.J, 0.0f);
            s1Var.f30124d0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f30125e0);
            s1Var.f30124d0.setDuration(300L);
            s1Var.f30124d0.start();
            float measuredWidth = this.f30078a - ((s1Var.getMeasuredWidth() - (s1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f30079b - ((s1Var.getMeasuredHeight() - (s1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            s1Var.setTranslationX(measuredWidth);
            s1Var.setTranslationY(measuredHeight);
            s1Var.setScaleX(0.23f);
            s1Var.setScaleY(0.23f);
            s1Var.animate().setListener(null).cancel();
            s1Var.animate().setListener(new v61(this, 11)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(es.f24465f).start();
            return false;
        }
        s1Var.M = false;
        s1Var.requestLayout();
        return false;
    }
}
