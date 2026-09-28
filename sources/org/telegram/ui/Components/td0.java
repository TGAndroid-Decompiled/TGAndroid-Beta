package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements Runnable {
    public final int f28538a;
    public final ee0 f28539b;

    public td0(ee0 ee0Var, int i10) {
        this.f28538a = i10;
        this.f28539b = ee0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28538a;
        ee0 ee0Var = this.f28539b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ee0Var.f23997r;
                if (ee0Var.f24000x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ee0Var.P, 0.0f);
                ofFloat.addUpdateListener(new ud0(ee0Var, 0));
                ofFloat.addListener(new hd0(ee0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(sr.h);
                ofFloat.start();
                return;
        }
    }
}
