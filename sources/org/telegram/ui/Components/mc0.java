package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mc0 implements Runnable {
    public final int f28452a;
    public final zc0 f28453b;

    public mc0(zc0 zc0Var, int i10) {
        this.f28452a = i10;
        this.f28453b = zc0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28452a;
        zc0 zc0Var = this.f28453b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = zc0Var.f33115r;
                if (!zc0Var.P && zc0Var.isAttachedToWindow() && zc0Var.f33119y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zc0Var.f33103a0, 0.0f);
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
