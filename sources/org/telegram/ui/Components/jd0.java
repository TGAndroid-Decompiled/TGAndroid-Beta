package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements Runnable {
    public final int f25946a;
    public final wd0 f25947b;

    public jd0(wd0 wd0Var, int i10) {
        this.f25946a = i10;
        this.f25947b = wd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25946a;
        wd0 wd0Var = this.f25947b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = wd0Var.f30228r;
                if (wd0Var.f30231x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(wd0Var.M, 0.0f);
                ofFloat.addUpdateListener(new kd0(wd0Var, 0));
                ofFloat.addListener(new a9(wd0Var, 29));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(mr.h);
                ofFloat.start();
                return;
        }
    }
}
