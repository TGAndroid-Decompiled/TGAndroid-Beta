package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dc0 implements Runnable {
    public final int f34272a;
    public final oc0 f34273b;

    public dc0(oc0 oc0Var, int i7) {
        this.f34272a = i7;
        this.f34273b = oc0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34272a;
        oc0 oc0Var = this.f34273b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = oc0Var.f38122r;
                if (!oc0Var.Q && oc0Var.isAttachedToWindow() && oc0Var.f38126y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(oc0Var.f38110b0, 0.0f);
                oc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new ec0(oc0Var, 1));
                ofFloat.addListener(new p60(oc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(kr.h);
                ofFloat.start();
                return;
        }
    }
}
