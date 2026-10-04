package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements Runnable {
    public final int f31030a;
    public final ee0 f31031b;

    public td0(ee0 ee0Var, int i10) {
        this.f31030a = i10;
        this.f31031b = ee0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f31030a;
        ee0 ee0Var = this.f31031b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ee0Var.f26063r;
                if (ee0Var.f26066x.getVisibility() != 0 && editTextBoldCursor != null) {
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
                ofFloat.setInterpolator(tr.h);
                ofFloat.start();
                return;
        }
    }
}
