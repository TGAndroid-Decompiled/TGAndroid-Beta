package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wq;
import org.telegram.ui.va;
public final class l1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f39359a;
    public final float f39360b;
    public final n1 f39361c;

    public l1(n1 n1Var, float f10, float f11) {
        this.f39361c = n1Var;
        this.f39359a = f10;
        this.f39360b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        n1 n1Var = this.f39361c;
        if (!n1Var.P) {
            ValueAnimator valueAnimator = n1Var.f39410d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.J, 0.0f);
            n1Var.f39410d0 = ofFloat;
            ofFloat.addUpdateListener(n1Var.f39412e0);
            n1Var.f39410d0.setDuration(300L);
            n1Var.f39410d0.start();
            float measuredWidth = this.f39359a - ((n1Var.getMeasuredWidth() - (n1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f39360b - ((n1Var.getMeasuredHeight() - (n1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            n1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            n1Var.setTranslationX(measuredWidth);
            n1Var.setTranslationY(measuredHeight);
            n1Var.setScaleX(0.23f);
            n1Var.setScaleY(0.23f);
            n1Var.animate().setListener(null).cancel();
            n1Var.animate().setListener(new va(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(wq.f40046f).start();
            return false;
        }
        n1Var.M = false;
        n1Var.requestLayout();
        return false;
    }
}
