package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ge0 implements Runnable {
    public final int f25260a;
    public final re0 f25261b;

    public ge0(re0 re0Var, int i10) {
        this.f25260a = i10;
        this.f25261b = re0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25260a;
        re0 re0Var = this.f25261b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = re0Var.f28820r;
                if (!re0Var.L && re0Var.isAttachedToWindow() && re0Var.f28823x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(re0Var.T, 0.0f);
                re0Var.O = ofFloat;
                ofFloat.addUpdateListener(new he0(re0Var, 0));
                ofFloat.addListener(new k90(re0Var, 4));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(es.h);
                ofFloat.start();
                return;
        }
    }
}
