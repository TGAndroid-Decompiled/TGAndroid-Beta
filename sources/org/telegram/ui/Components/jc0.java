package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jc0 extends AnimatorListenerAdapter {
    public final int f36472a;
    public final kc0 f36473b;

    public jc0(kc0 kc0Var, int i7) {
        this.f36472a = i7;
        this.f36473b = kc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36472a) {
            case 0:
                qc0 qc0Var = this.f36473b.d;
                if (!qc0Var.Q) {
                    qc0Var.f38881b0 = 1.0f;
                    qc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                kc0 kc0Var = this.f36473b;
                qc0 qc0Var2 = kc0Var.d;
                if (!qc0Var2.Q) {
                    Runnable runnable = kc0Var.f36885c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.bz.f23219r == 1 && qc0Var2.f38897y.getVisibility() != 0 && (editTextBoldCursor = qc0Var2.f38893r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(qc0Var2.f38893r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
