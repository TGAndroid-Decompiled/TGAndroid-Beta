package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements Runnable {
    public final int f28165a;
    public final de0 f28166b;

    public sd0(de0 de0Var, int i10) {
        this.f28165a = i10;
        this.f28166b = de0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28165a;
        de0 de0Var = this.f28166b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = de0Var.f23672r;
                if (de0Var.f23675x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(de0Var.P, 0.0f);
                ofFloat.addUpdateListener(new td0(de0Var, 0));
                ofFloat.addListener(new gd0(de0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                return;
        }
    }
}
