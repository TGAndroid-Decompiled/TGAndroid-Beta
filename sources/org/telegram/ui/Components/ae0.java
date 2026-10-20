package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f24581a;
    public final me0 f24582b;

    public ae0(me0 me0Var, int i10) {
        this.f24581a = i10;
        this.f24582b = me0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24581a;
        me0 me0Var = this.f24582b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = me0Var.f28504r;
                if (!me0Var.P && me0Var.isAttachedToWindow() && me0Var.f28507x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(me0Var.f28492a0, 0.0f);
                me0Var.S = ofFloat;
                ofFloat.addUpdateListener(new be0(me0Var, 1));
                ofFloat.addListener(new c80(me0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(bs.h);
                ofFloat.start();
                return;
        }
    }
}
