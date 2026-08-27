package org.telegram.ui;

import android.animation.ValueAnimator;

public final class n9 implements ValueAnimator.AnimatorUpdateListener {

    public final int f40690a;

    public final t9 f40691b;

    public n9(t9 t9Var, int i10) {
        this.f40690a = i10;
        this.f40691b = t9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40690a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.f40691b;
                t9Var.T = fFloatValue;
                t9Var.f42818a.setAlpha(1.0f - fFloatValue);
                if (t9Var.R == 3) {
                    t9Var.f42820b.setAlpha(1.0f - t9Var.T);
                }
                t9Var.f42825r.setAlpha(1.0f - t9Var.T);
                t9Var.v = (t9Var.T * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                break;
            default:
                this.f40691b.f42825r.invalidate();
                break;
        }
    }
}
