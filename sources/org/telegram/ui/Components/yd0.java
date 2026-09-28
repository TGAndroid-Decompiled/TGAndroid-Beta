package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f30650a;
    public final zd0 f30651b;

    public yd0(zd0 zd0Var, int i10) {
        this.f30650a = i10;
        this.f30651b = zd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f30650a) {
            case 0:
                ee0 ee0Var = this.f30651b.d;
                ee0Var.P = 1.0f;
                ee0Var.f(1.0f);
                return;
            default:
                zd0 zd0Var = this.f30651b;
                Runnable runnable = zd0Var.f30874c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && zd0Var.d.f24001x.getVisibility() != 0 && (editTextBoldCursor = zd0Var.d.f23998r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(zd0Var.d.f23998r);
                    return;
                }
                return;
        }
    }
}
