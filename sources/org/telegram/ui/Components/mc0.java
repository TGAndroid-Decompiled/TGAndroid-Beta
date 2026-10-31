package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mc0 implements Runnable {
    public final int f28415a;
    public final zc0 f28416b;

    public mc0(zc0 zc0Var, int i10) {
        this.f28415a = i10;
        this.f28416b = zc0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28415a;
        zc0 zc0Var = this.f28416b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = zc0Var.f33019r;
                if (!zc0Var.P && zc0Var.isAttachedToWindow() && zc0Var.f33023y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zc0Var.f33007a0, 0.0f);
                zc0Var.S = ofFloat;
                ofFloat.addUpdateListener(new nc0(zc0Var, 1));
                ofFloat.addListener(new t60(zc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
                return;
        }
    }
}
