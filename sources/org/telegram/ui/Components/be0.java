package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class be0 implements Runnable {
    public final int f24991a;
    public final ne0 f24992b;

    public be0(ne0 ne0Var, int i10) {
        this.f24991a = i10;
        this.f24992b = ne0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24991a;
        ne0 ne0Var = this.f24992b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ne0Var.f28894r;
                if (!ne0Var.P && ne0Var.isAttachedToWindow() && ne0Var.f28897x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ne0Var.f28882a0, 0.0f);
                ne0Var.S = ofFloat;
                ofFloat.addUpdateListener(new ce0(ne0Var, 1));
                ofFloat.addListener(new g60(ne0Var, 7));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(zr.h);
                ofFloat.start();
                return;
        }
    }
}
