package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements Runnable {
    public final int f27953a;
    public final ce0 f27954b;

    public rd0(ce0 ce0Var, int i10) {
        this.f27953a = i10;
        this.f27954b = ce0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27953a;
        ce0 ce0Var = this.f27954b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ce0Var.f23326r;
                if (ce0Var.f23329x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ce0Var.P, 0.0f);
                ofFloat.addUpdateListener(new sd0(ce0Var, 0));
                ofFloat.addListener(new fd0(ce0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(rr.h);
                ofFloat.start();
                return;
        }
    }
}
