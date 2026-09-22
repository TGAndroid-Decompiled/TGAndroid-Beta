package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t81;
public final class s1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29565a;
    public final float f29566b;
    public final u1 f29567c;

    public s1(u1 u1Var, float f7, float f10) {
        this.f29567c = u1Var;
        this.f29565a = f7;
        this.f29566b = f10;
    }

    @Override
    public final boolean onPreDraw() {
        u1 u1Var = this.f29567c;
        if (!u1Var.P) {
            ValueAnimator valueAnimator = u1Var.f29649d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(u1Var.J, 0.0f);
            u1Var.f29649d0 = ofFloat;
            ofFloat.addUpdateListener(u1Var.f29650e0);
            u1Var.f29649d0.setDuration(300L);
            u1Var.f29649d0.start();
            float measuredWidth = this.f29565a - ((u1Var.getMeasuredWidth() - (u1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f29566b - ((u1Var.getMeasuredHeight() - (u1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            u1Var.setTranslationX(measuredWidth);
            u1Var.setTranslationY(measuredHeight);
            u1Var.setScaleX(0.23f);
            u1Var.setScaleY(0.23f);
            u1Var.animate().setListener(null).cancel();
            u1Var.animate().setListener(new t81(this, 8)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(qr.f27653f).start();
            return false;
        }
        u1Var.M = false;
        u1Var.requestLayout();
        return false;
    }
}
