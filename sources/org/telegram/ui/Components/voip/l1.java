package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;
public final class l1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f39350a;
    public final float f39351b;
    public final n1 f39352c;

    public l1(n1 n1Var, float f10, float f11) {
        this.f39352c = n1Var;
        this.f39350a = f10;
        this.f39351b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        n1 n1Var = this.f39352c;
        if (!n1Var.P) {
            ValueAnimator valueAnimator = n1Var.f39401d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.J, 0.0f);
            n1Var.f39401d0 = ofFloat;
            ofFloat.addUpdateListener(n1Var.f39403e0);
            n1Var.f39401d0.setDuration(300L);
            n1Var.f39401d0.start();
            float measuredWidth = this.f39350a - ((n1Var.getMeasuredWidth() - (n1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f39351b - ((n1Var.getMeasuredHeight() - (n1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            n1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            n1Var.setTranslationX(measuredWidth);
            n1Var.setTranslationY(measuredHeight);
            n1Var.setScaleX(0.23f);
            n1Var.setScaleY(0.23f);
            n1Var.animate().setListener(null).cancel();
            n1Var.animate().setListener(new va(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(xq.f40366f).start();
            return false;
        }
        n1Var.M = false;
        n1Var.requestLayout();
        return false;
    }
}
