package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ud0 implements Runnable {
    public final int f28839a;
    public final fe0 f28840b;

    public ud0(fe0 fe0Var, int i10) {
        this.f28839a = i10;
        this.f28840b = fe0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28839a;
        fe0 fe0Var = this.f28840b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = fe0Var.f24284r;
                if (fe0Var.f24287x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fe0Var.P, 0.0f);
                ofFloat.addUpdateListener(new vd0(fe0Var, 0));
                ofFloat.addListener(new id0(fe0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(tr.h);
                ofFloat.start();
                return;
        }
    }
}
