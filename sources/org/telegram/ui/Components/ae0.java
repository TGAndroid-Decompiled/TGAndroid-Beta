package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f26542a;
    public final me0 f26543b;

    public ae0(me0 me0Var, int i10) {
        this.f26542a = i10;
        this.f26543b = me0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26542a;
        me0 me0Var = this.f26543b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = me0Var.f30526r;
                if (!me0Var.P && me0Var.isAttachedToWindow() && me0Var.f30529x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(me0Var.f30514a0, 0.0f);
                me0Var.S = ofFloat;
                ofFloat.addUpdateListener(new be0(me0Var, 1));
                ofFloat.addListener(new i10(me0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(ds.h);
                ofFloat.start();
                return;
        }
    }
}
