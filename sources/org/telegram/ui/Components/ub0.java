package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ub0 implements Runnable {
    public final int f39991a;
    public final fc0 f39992b;

    public ub0(fc0 fc0Var, int i7) {
        this.f39991a = i7;
        this.f39992b = fc0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f39991a;
        fc0 fc0Var = this.f39992b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = fc0Var.f34579r;
                if (!fc0Var.Q && fc0Var.isAttachedToWindow() && fc0Var.f34583y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fc0Var.f34567b0, 0.0f);
                fc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new vb0(fc0Var, 1));
                ofFloat.addListener(new h60(fc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
                return;
        }
    }
}
