package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements Runnable {
    public final int f28252a;
    public final de0 f28253b;

    public sd0(de0 de0Var, int i10) {
        this.f28252a = i10;
        this.f28253b = de0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28252a;
        de0 de0Var = this.f28253b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = de0Var.f23685r;
                if (de0Var.f23688x.getVisibility() != 0 && editTextBoldCursor != null) {
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
                ofFloat.setInterpolator(sr.h);
                ofFloat.start();
                return;
        }
    }
}
