package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ob0 implements Runnable {
    public final int f36798a;
    public final zb0 f36799b;

    public ob0(zb0 zb0Var, int i3) {
        this.f36798a = i3;
        this.f36799b = zb0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f36798a;
        zb0 zb0Var = this.f36799b;
        switch (i3) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = zb0Var.f41013r;
                if (!zb0Var.Q && zb0Var.isAttachedToWindow() && zb0Var.f41017y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zb0Var.f41001b0, 0.0f);
                zb0Var.T = ofFloat;
                ofFloat.addUpdateListener(new pb0(zb0Var, 1));
                ofFloat.addListener(new a60(zb0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                return;
        }
    }
}
