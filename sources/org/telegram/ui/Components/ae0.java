package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f24573a;
    public final le0 f24574b;

    public ae0(le0 le0Var, int i10) {
        this.f24573a = i10;
        this.f24574b = le0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24573a;
        le0 le0Var = this.f24574b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = le0Var.f28217r;
                if (!le0Var.P && le0Var.isAttachedToWindow() && le0Var.f28220x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(le0Var.f28205a0, 0.0f);
                le0Var.S = ofFloat;
                ofFloat.addUpdateListener(new be0(le0Var, 1));
                ofFloat.addListener(new c80(le0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(bs.h);
                ofFloat.start();
                return;
        }
    }
}
