package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tb0 implements Runnable {
    public final int f38270a;
    public final ec0 f38271b;

    public tb0(ec0 ec0Var, int i7) {
        this.f38270a = i7;
        this.f38271b = ec0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f38270a;
        ec0 ec0Var = this.f38271b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ec0Var.f33218r;
                if (!ec0Var.P && ec0Var.isAttachedToWindow() && ec0Var.f33222y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ec0Var.f33205a0, 0.0f);
                ec0Var.S = ofFloat;
                ofFloat.addUpdateListener(new ub0(ec0Var, 1));
                ofFloat.addListener(new e60(ec0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wq.h);
                ofFloat.start();
                return;
        }
    }
}
