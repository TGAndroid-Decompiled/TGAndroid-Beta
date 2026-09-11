package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements Runnable {
    public final int f26710a;
    public final sd0 f26711b;

    public hd0(sd0 sd0Var, int i10) {
        this.f26710a = i10;
        this.f26711b = sd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26710a;
        sd0 sd0Var = this.f26711b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = sd0Var.f30261r;
                if (sd0Var.f30264x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(sd0Var.P, 0.0f);
                ofFloat.addUpdateListener(new id0(sd0Var, 0));
                ofFloat.addListener(new r80(sd0Var, 3));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
                return;
        }
    }
}
