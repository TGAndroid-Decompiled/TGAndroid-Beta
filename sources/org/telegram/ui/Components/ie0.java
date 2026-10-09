package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ie0 implements Runnable {
    public final int f27369a;
    public final te0 f27370b;

    public ie0(te0 te0Var, int i10) {
        this.f27369a = i10;
        this.f27370b = te0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27369a;
        te0 te0Var = this.f27370b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = te0Var.f31168r;
                if (!te0Var.L && te0Var.isAttachedToWindow() && te0Var.f31171x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(te0Var.T, 0.0f);
                te0Var.O = ofFloat;
                ofFloat.addUpdateListener(new je0(te0Var, 0));
                ofFloat.addListener(new vd0(te0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(hs.h);
                ofFloat.start();
                return;
        }
    }
}
