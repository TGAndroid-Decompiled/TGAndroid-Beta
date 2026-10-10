package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class je0 implements Runnable {
    public final int f27665a;
    public final ue0 f27666b;

    public je0(ue0 ue0Var, int i10) {
        this.f27665a = i10;
        this.f27666b = ue0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27665a;
        ue0 ue0Var = this.f27666b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ue0Var.f31481r;
                if (!ue0Var.L && ue0Var.isAttachedToWindow() && ue0Var.f31484x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ue0Var.T, 0.0f);
                ue0Var.O = ofFloat;
                ofFloat.addUpdateListener(new ke0(ue0Var, 0));
                ofFloat.addListener(new wd0(ue0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(is.h);
                ofFloat.start();
                return;
        }
    }
}
