package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f29952a;
    public final xd0 f29953b;

    public wd0(xd0 xd0Var, int i10) {
        this.f29952a = i10;
        this.f29953b = xd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29952a) {
            case 0:
                ce0 ce0Var = this.f29953b.d;
                ce0Var.P = 1.0f;
                ce0Var.f(1.0f);
                return;
            default:
                xd0 xd0Var = this.f29953b;
                Runnable runnable = xd0Var.f30316c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && xd0Var.d.f23318x.getVisibility() != 0 && (editTextBoldCursor = xd0Var.d.f23315r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(xd0Var.d.f23315r);
                    return;
                }
                return;
        }
    }
}
