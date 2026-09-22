package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 implements Runnable {
    public final int f24320a;
    public final sd0 f24321b;

    public gd0(sd0 sd0Var, int i10) {
        this.f24320a = i10;
        this.f24321b = sd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24320a;
        sd0 sd0Var = this.f24321b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = sd0Var.f27834r;
                if (sd0Var.f27837x.getVisibility() != 0 && editTextBoldCursor != null) {
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
