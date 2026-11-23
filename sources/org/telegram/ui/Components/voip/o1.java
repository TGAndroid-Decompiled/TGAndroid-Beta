package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.nr;
public final class o1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f41240a;
    public final float f41241b;
    public final q1 f41242c;

    public o1(q1 q1Var, float f10, float f11) {
        this.f41242c = q1Var;
        this.f41240a = f10;
        this.f41241b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        q1 q1Var = this.f41242c;
        if (!q1Var.Q) {
            ValueAnimator valueAnimator = q1Var.f41284e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q1Var.K, 0.0f);
            q1Var.f41284e0 = ofFloat;
            ofFloat.addUpdateListener(q1Var.f41286f0);
            q1Var.f41284e0.setDuration(300L);
            q1Var.f41284e0.start();
            float measuredWidth = this.f41240a - ((q1Var.getMeasuredWidth() - (q1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f41241b - ((q1Var.getMeasuredHeight() - (q1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            q1Var.setTranslationX(measuredWidth);
            q1Var.setTranslationY(measuredHeight);
            q1Var.setScaleX(0.23f);
            q1Var.setScaleY(0.23f);
            q1Var.animate().setListener(null).cancel();
            q1Var.animate().setListener(new y9(this, 16)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(nr.f37961f).start();
            return false;
        }
        q1Var.N = false;
        q1Var.requestLayout();
        return false;
    }
}
