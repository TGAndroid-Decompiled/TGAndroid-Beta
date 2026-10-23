package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class de0 implements Runnable {
    public final int f25617a;
    public final pe0 f25618b;

    public de0(pe0 pe0Var, int i10) {
        this.f25617a = i10;
        this.f25618b = pe0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25617a;
        pe0 pe0Var = this.f25618b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = pe0Var.f29538r;
                if (!pe0Var.P && pe0Var.isAttachedToWindow() && pe0Var.f29541x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pe0Var.f29526a0, 0.0f);
                pe0Var.S = ofFloat;
                ofFloat.addUpdateListener(new ee0(pe0Var, 1));
                ofFloat.addListener(new i60(pe0Var, 7));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(bs.h);
                ofFloat.start();
                return;
        }
    }
}
