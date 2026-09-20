package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pd0 implements Runnable {
    public final int f27276a;
    public final ae0 f27277b;

    public pd0(ae0 ae0Var, int i10) {
        this.f27276a = i10;
        this.f27277b = ae0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27276a;
        ae0 ae0Var = this.f27277b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ae0Var.f22661r;
                if (ae0Var.f22664x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ae0Var.P, 0.0f);
                ofFloat.addUpdateListener(new qd0(ae0Var, 0));
                ofFloat.addListener(new dd0(ae0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                return;
        }
    }
}
