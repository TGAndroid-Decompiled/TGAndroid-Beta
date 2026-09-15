package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 implements Runnable {
    public final int f24323a;
    public final sd0 f24324b;

    public gd0(sd0 sd0Var, int i10) {
        this.f24323a = i10;
        this.f24324b = sd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24323a;
        sd0 sd0Var = this.f24324b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = sd0Var.f27837r;
                if (sd0Var.f27840x.getVisibility() != 0 && editTextBoldCursor != null) {
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
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                return;
        }
    }
}
