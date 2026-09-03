package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.pr;
public final class r1 implements ViewTreeObserver.OnPreDrawListener {
    public final float f32308a;
    public final float f32309b;
    public final t1 f32310c;

    public r1(t1 t1Var, float f10, float f11) {
        this.f32310c = t1Var;
        this.f32308a = f10;
        this.f32309b = f11;
    }

    @Override
    public final boolean onPreDraw() {
        t1 t1Var = this.f32310c;
        if (!t1Var.M) {
            ValueAnimator valueAnimator = t1Var.f32334a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.G, 0.0f);
            t1Var.f32334a0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f32336b0);
            t1Var.f32334a0.setDuration(300L);
            t1Var.f32334a0.start();
            float measuredWidth = this.f32308a - ((t1Var.getMeasuredWidth() - (t1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.f32309b - ((t1Var.getMeasuredHeight() - (t1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
            t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
            t1Var.setTranslationX(measuredWidth);
            t1Var.setTranslationY(measuredHeight);
            t1Var.setScaleX(0.23f);
            t1Var.setScaleY(0.23f);
            t1Var.animate().setListener(null).cancel();
            t1Var.animate().setListener(new f91(this, 6)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(pr.f30168f).start();
            return false;
        }
        t1Var.J = false;
        t1Var.requestLayout();
        return false;
    }
}
