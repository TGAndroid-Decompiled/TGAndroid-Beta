package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;

public final class q1 implements ViewTreeObserver.OnPreDrawListener {

    public final float f33813a;

    public final float f33814b;

    public final s1 f33815c;

    public q1(s1 s1Var, float f10, float f11) {
        this.f33815c = s1Var;
        this.f33813a = f10;
        this.f33814b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        s1 s1Var = this.f33815c;
        if (s1Var.L) {
            s1Var.I = false;
            s1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = s1Var.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s1Var.F, 0.0f);
        s1Var.W = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(s1Var.f33847a0);
        s1Var.W.setDuration(300L);
        s1Var.W.start();
        float measuredWidth = this.f33813a - ((s1Var.getMeasuredWidth() - (s1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.f33814b - ((s1Var.getMeasuredHeight() - (s1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s1Var.setTranslationX(measuredWidth);
        s1Var.setTranslationY(measuredHeight);
        s1Var.setScaleX(0.23f);
        s1Var.setScaleY(0.23f);
        s1Var.animate().setListener(null).cancel();
        s1Var.animate().setListener(new f11(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(er.f28122f).start();
        return false;
    }
}
