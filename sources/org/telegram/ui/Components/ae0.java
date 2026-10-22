package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f24584a;
    public final me0 f24585b;

    public ae0(me0 me0Var, int i10) {
        this.f24584a = i10;
        this.f24585b = me0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24584a;
        me0 me0Var = this.f24585b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = me0Var.f28507r;
                if (!me0Var.P && me0Var.isAttachedToWindow() && me0Var.f28510x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(me0Var.f28495a0, 0.0f);
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
