package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements Runnable {
    public final int f26711a;
    public final sd0 f26712b;

    public hd0(sd0 sd0Var, int i10) {
        this.f26711a = i10;
        this.f26712b = sd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26711a;
        sd0 sd0Var = this.f26712b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = sd0Var.f30262r;
                if (sd0Var.f30265x.getVisibility() != 0 && editTextBoldCursor != null) {
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
