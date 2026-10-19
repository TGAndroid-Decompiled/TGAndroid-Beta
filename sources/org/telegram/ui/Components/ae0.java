package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f24553a;
    public final le0 f24554b;

    public ae0(le0 le0Var, int i10) {
        this.f24553a = i10;
        this.f24554b = le0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24553a;
        le0 le0Var = this.f24554b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = le0Var.f28202r;
                if (!le0Var.P && le0Var.isAttachedToWindow() && le0Var.f28205x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(le0Var.f28190a0, 0.0f);
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
