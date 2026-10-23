package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f24585a;
    public final me0 f24586b;

    public ae0(me0 me0Var, int i10) {
        this.f24585a = i10;
        this.f24586b = me0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24585a;
        me0 me0Var = this.f24586b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = me0Var.f28508r;
                if (!me0Var.P && me0Var.isAttachedToWindow() && me0Var.f28511x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(me0Var.f28496a0, 0.0f);
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
