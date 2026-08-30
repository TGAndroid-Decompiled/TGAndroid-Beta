package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class id0 implements Runnable {
    public final int f25695a;
    public final vd0 f25696b;

    public id0(vd0 vd0Var, int i10) {
        this.f25695a = i10;
        this.f25696b = vd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25695a;
        vd0 vd0Var = this.f25696b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = vd0Var.f29438r;
                if (vd0Var.f29441x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(vd0Var.M, 0.0f);
                ofFloat.addUpdateListener(new jd0(vd0Var, 0));
                ofFloat.addListener(new a9(vd0Var, 29));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
                return;
        }
    }
}
