package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class me0 implements Runnable {
    public final int f28529a;
    public final xe0 f28530b;

    public me0(xe0 xe0Var, int i10) {
        this.f28529a = i10;
        this.f28530b = xe0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28529a;
        xe0 xe0Var = this.f28530b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = xe0Var.f32738r;
                if (!xe0Var.L && xe0Var.isAttachedToWindow() && xe0Var.f32741x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(xe0Var.T, 0.0f);
                xe0Var.O = ofFloat;
                ofFloat.addUpdateListener(new ne0(xe0Var, 0));
                ofFloat.addListener(new zd0(xe0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(js.h);
                ofFloat.start();
                return;
        }
    }
}
