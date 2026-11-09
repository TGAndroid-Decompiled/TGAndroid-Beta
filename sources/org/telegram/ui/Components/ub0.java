package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ub0 implements Runnable {
    public final int f38682a;
    public final fc0 f38683b;

    public ub0(fc0 fc0Var, int i7) {
        this.f38682a = i7;
        this.f38683b = fc0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f38682a;
        fc0 fc0Var = this.f38683b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = fc0Var.f33632r;
                if (!fc0Var.P && fc0Var.isAttachedToWindow() && fc0Var.f33636y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fc0Var.f33619a0, 0.0f);
                fc0Var.S = ofFloat;
                ofFloat.addUpdateListener(new vb0(fc0Var, 1));
                ofFloat.addListener(new f60(fc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                return;
        }
    }
}
