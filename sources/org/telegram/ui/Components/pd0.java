package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f27838a;
    public final qd0 f27839b;

    public pd0(qd0 qd0Var, int i10) {
        this.f27838a = i10;
        this.f27839b = qd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f27838a) {
            case 0:
                wd0 wd0Var = this.f27839b.d;
                wd0Var.M = 1.0f;
                wd0Var.f(1.0f);
                return;
            default:
                qd0 qd0Var = this.f27839b;
                Runnable runnable = qd0Var.f28147c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && qd0Var.d.f30231x.getVisibility() != 0 && (editTextBoldCursor = qd0Var.d.f30228r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(qd0Var.d.f30228r);
                    return;
                }
                return;
        }
    }
}
