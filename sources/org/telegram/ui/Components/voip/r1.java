package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zn0;
public final class r1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f28369a;
    public final float f28370b;
    public final t1 f28371c;

    public r1(t1 t1Var, float f7, float f10) {
        this.f28371c = t1Var;
        this.f28369a = f7;
        this.f28370b = f10;
    }

    @Override
    public final boolean onPreDraw() {
        t1 t1Var = this.f28371c;
        if (!t1Var.P) {
            ValueAnimator valueAnimator = t1Var.f28453d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.J, 0.0f);
            t1Var.f28453d0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f28454e0);
            t1Var.f28453d0.setDuration(300L);
            t1Var.f28453d0.start();
            float measuredWidth = this.f28369a - ((t1Var.getMeasuredWidth() - (t1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f28370b - ((t1Var.getMeasuredHeight() - (t1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            t1Var.setTranslationX(measuredWidth);
            t1Var.setTranslationY(measuredHeight);
            t1Var.setScaleX(0.23f);
            t1Var.setScaleY(0.23f);
            t1Var.animate().setListener(null).cancel();
            t1Var.animate().setListener(new zn0(this, 27)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(wr.f28819f).start();
            return false;
        }
        t1Var.M = false;
        t1Var.requestLayout();
        return false;
    }
}
