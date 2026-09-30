package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements Runnable {
    public final int f28537a;
    public final ee0 f28538b;

    public td0(ee0 ee0Var, int i10) {
        this.f28537a = i10;
        this.f28538b = ee0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28537a;
        ee0 ee0Var = this.f28538b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ee0Var.f23995r;
                if (ee0Var.f23998x.getVisibility() != 0 && editTextBoldCursor != null) {
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
