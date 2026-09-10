package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qd0 implements Runnable {
    public final int f26396a;
    public final be0 f26397b;

    public qd0(be0 be0Var, int i10) {
        this.f26396a = i10;
        this.f26397b = be0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26396a;
        be0 be0Var = this.f26397b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = be0Var.f21813r;
                if (be0Var.f21816x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(be0Var.P, 0.0f);
                ofFloat.addUpdateListener(new rd0(be0Var, 0));
                ofFloat.addListener(new rm(be0Var, 20));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wr.h);
                ofFloat.start();
                return;
        }
    }
}
