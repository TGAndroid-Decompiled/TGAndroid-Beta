package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements Runnable {
    public final int f28397a;
    public final xd0 f28398b;

    public kd0(xd0 xd0Var, int i10) {
        this.f28397a = i10;
        this.f28398b = xd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28397a;
        xd0 xd0Var = this.f28398b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = xd0Var.f33042r;
                if (xd0Var.f33045x.getVisibility() != 0 && editTextBoldCursor != null) {
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
