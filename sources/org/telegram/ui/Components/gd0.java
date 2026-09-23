package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 implements Runnable {
    public final int f24265a;
    public final sd0 f24266b;

    public gd0(sd0 sd0Var, int i10) {
        this.f24265a = i10;
        this.f24266b = sd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24265a;
        sd0 sd0Var = this.f24266b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = sd0Var.f27918r;
                if (sd0Var.f27921x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(sd0Var.P, 0.0f);
                ofFloat.addUpdateListener(new hd0(sd0Var, 0));
                ofFloat.addListener(new jd0(sd0Var, 0));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(rr.h);
                ofFloat.start();
                return;
        }
    }
}
