package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fc0 implements Runnable {
    public final int f35203a;
    public final qc0 f35204b;

    public fc0(qc0 qc0Var, int i7) {
        this.f35203a = i7;
        this.f35204b = qc0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35203a;
        qc0 qc0Var = this.f35204b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = qc0Var.f38887r;
                if (!qc0Var.Q && qc0Var.isAttachedToWindow() && qc0Var.f38891y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qc0Var.f38875b0, 0.0f);
                qc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new gc0(qc0Var, 1));
                ofFloat.addListener(new s60(qc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
                return;
        }
    }
}
