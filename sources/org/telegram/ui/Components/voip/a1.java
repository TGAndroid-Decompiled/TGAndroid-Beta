package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.xq;
public final class a1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f39217a;
    public final float f39218b;
    public final c1 f39219c;

    public a1(c1 c1Var, float f10, float f11) {
        this.f39219c = c1Var;
        this.f39217a = f10;
        this.f39218b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        c1 c1Var = this.f39219c;
        if (!c1Var.Q) {
            ValueAnimator valueAnimator = c1Var.f39258e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.K, 0.0f);
            c1Var.f39258e0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.f39260f0);
            c1Var.f39258e0.setDuration(300L);
            c1Var.f39258e0.start();
            float measuredWidth = this.f39217a - ((c1Var.getMeasuredWidth() - (c1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f39218b - ((c1Var.getMeasuredHeight() - (c1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            c1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            c1Var.setTranslationX(measuredWidth);
            c1Var.setTranslationY(measuredHeight);
            c1Var.setScaleX(0.23f);
            c1Var.setScaleY(0.23f);
            c1Var.animate().setListener(null).cancel();
            c1Var.animate().setListener(new w9(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(xq.f40452f).start();
            return false;
        }
        c1Var.N = false;
        c1Var.requestLayout();
        return false;
    }
}
