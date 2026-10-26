package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class zd0 implements Runnable {
    public final int f35309a;
    public final le0 f35310b;

    public zd0(le0 le0Var, int i10) {
        this.f35309a = i10;
        this.f35310b = le0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35309a;
        le0 le0Var = this.f35310b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = le0Var.f30198r;
                if (!le0Var.P && le0Var.isAttachedToWindow() && le0Var.f30201x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(le0Var.f30186a0, 0.0f);
                le0Var.S = ofFloat;
                ofFloat.addUpdateListener(new ae0(le0Var, 1));
                ofFloat.addListener(new i10(le0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(ds.h);
                ofFloat.start();
                return;
        }
    }
}
