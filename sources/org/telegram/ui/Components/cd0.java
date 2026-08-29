package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements Runnable {
    public final int f27459a;
    public final nd0 f27460b;

    public cd0(nd0 nd0Var, int i10) {
        this.f27459a = i10;
        this.f27460b = nd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27459a;
        nd0 nd0Var = this.f27460b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = nd0Var.f30966r;
                if (nd0Var.f30969x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nd0Var.L, 0.0f);
                ofFloat.addUpdateListener(new dd0(nd0Var, 0));
                ofFloat.addListener(new zz(nd0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(jr.h);
                ofFloat.start();
                return;
        }
    }
}
