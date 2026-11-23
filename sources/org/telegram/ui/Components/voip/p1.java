package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.kr;
public final class p1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f41135a;
    public final float f41136b;
    public final r1 f41137c;

    public p1(r1 r1Var, float f10, float f11) {
        this.f41137c = r1Var;
        this.f41135a = f10;
        this.f41136b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        r1 r1Var = this.f41137c;
        if (!r1Var.Q) {
            ValueAnimator valueAnimator = r1Var.f41179e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r1Var.K, 0.0f);
            r1Var.f41179e0 = ofFloat;
            ofFloat.addUpdateListener(r1Var.f41181f0);
            r1Var.f41179e0.setDuration(300L);
            r1Var.f41179e0.start();
            float measuredWidth = this.f41135a - ((r1Var.getMeasuredWidth() - (r1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f41136b - ((r1Var.getMeasuredHeight() - (r1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            r1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            r1Var.setTranslationX(measuredWidth);
            r1Var.setTranslationY(measuredHeight);
            r1Var.setScaleX(0.23f);
            r1Var.setScaleY(0.23f);
            r1Var.animate().setListener(null).cancel();
            r1Var.animate().setListener(new x9(this, 16)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(kr.f36858f).start();
            return false;
        }
        r1Var.N = false;
        r1Var.requestLayout();
        return false;
    }
}
