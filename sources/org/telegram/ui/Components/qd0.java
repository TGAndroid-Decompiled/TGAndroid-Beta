package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qd0 implements Runnable {
    public final int f27578a;
    public final be0 f27579b;

    public qd0(be0 be0Var, int i10) {
        this.f27578a = i10;
        this.f27579b = be0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27578a;
        be0 be0Var = this.f27579b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = be0Var.f22988r;
                if (be0Var.f22991x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(be0Var.P, 0.0f);
                ofFloat.addUpdateListener(new rd0(be0Var, 0));
                ofFloat.addListener(new ed0(be0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                return;
        }
    }
}
