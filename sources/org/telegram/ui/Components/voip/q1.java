package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.mr;
public final class q1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29838a;
    public final float f29839b;
    public final s1 f29840c;

    public q1(s1 s1Var, float f10, float f11) {
        this.f29840c = s1Var;
        this.f29838a = f10;
        this.f29839b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        s1 s1Var = this.f29840c;
        if (!s1Var.M) {
            ValueAnimator valueAnimator = s1Var.f29862a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.G, 0.0f);
            s1Var.f29862a0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f29864b0);
            s1Var.f29862a0.setDuration(300L);
            s1Var.f29862a0.start();
            float measuredWidth = this.f29838a - ((s1Var.getMeasuredWidth() - (s1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f29839b - ((s1Var.getMeasuredHeight() - (s1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            s1Var.setTranslationX(measuredWidth);
            s1Var.setTranslationY(measuredHeight);
            s1Var.setScaleX(0.23f);
            s1Var.setScaleY(0.23f);
            s1Var.animate().setListener(null).cancel();
            s1Var.animate().setListener(new f91(this, 6)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(mr.f27122f).start();
            return false;
        }
        s1Var.J = false;
        s1Var.requestLayout();
        return false;
    }
}
