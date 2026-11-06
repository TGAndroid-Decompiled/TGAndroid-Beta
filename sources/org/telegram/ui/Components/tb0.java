package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tb0 implements Runnable {
    public final int f38310a;
    public final ec0 f38311b;

    public tb0(ec0 ec0Var, int i7) {
        this.f38310a = i7;
        this.f38311b = ec0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f38310a;
        ec0 ec0Var = this.f38311b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ec0Var.f33208r;
                if (!ec0Var.P && ec0Var.isAttachedToWindow() && ec0Var.f33212y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ec0Var.f33195a0, 0.0f);
                ec0Var.S = ofFloat;
                ofFloat.addUpdateListener(new ub0(ec0Var, 1));
                ofFloat.addListener(new e60(ec0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                return;
        }
    }
}
