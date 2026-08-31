package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements Runnable {
    public final int f28375a;
    public final xd0 f28376b;

    public kd0(xd0 xd0Var, int i10) {
        this.f28375a = i10;
        this.f28376b = xd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28375a;
        xd0 xd0Var = this.f28376b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = xd0Var.f33048r;
                if (xd0Var.f33051x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(xd0Var.M, 0.0f);
                ofFloat.addUpdateListener(new ld0(xd0Var, 0));
                ofFloat.addListener(new a9(xd0Var, 29));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
                return;
        }
    }
}
