package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ec0 implements Runnable {
    public final int f34671a;
    public final pc0 f34672b;

    public ec0(pc0 pc0Var, int i7) {
        this.f34671a = i7;
        this.f34672b = pc0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34671a;
        pc0 pc0Var = this.f34672b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = pc0Var.f38375r;
                if (!pc0Var.Q && pc0Var.isAttachedToWindow() && pc0Var.f38379y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pc0Var.f38363b0, 0.0f);
                pc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new fc0(pc0Var, 1));
                ofFloat.addListener(new q60(pc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(lr.h);
                ofFloat.start();
                return;
        }
    }
}
