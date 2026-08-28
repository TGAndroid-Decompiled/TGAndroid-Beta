package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 implements Runnable {
    public final int f31075a;
    public final yc0 f31076b;

    public nc0(yc0 yc0Var, int i9) {
        this.f31075a = i9;
        this.f31076b = yc0Var;
    }

    @Override
    public final void run() {
        int i9 = this.f31075a;
        yc0 yc0Var = this.f31076b;
        switch (i9) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = yc0Var.f34946r;
                if (yc0Var.f34949x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(yc0Var.L, 0.0f);
                ofFloat.addUpdateListener(new oc0(yc0Var, 0));
                ofFloat.addListener(new r60(yc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
                return;
        }
    }
}
