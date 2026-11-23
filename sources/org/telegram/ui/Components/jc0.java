package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jc0 extends AnimatorListenerAdapter {
    public final int f36466a;
    public final kc0 f36467b;

    public jc0(kc0 kc0Var, int i7) {
        this.f36466a = i7;
        this.f36467b = kc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36466a) {
            case 0:
                qc0 qc0Var = this.f36467b.d;
                if (!qc0Var.Q) {
                    qc0Var.f38874b0 = 1.0f;
                    qc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                kc0 kc0Var = this.f36467b;
                qc0 qc0Var2 = kc0Var.d;
                if (!qc0Var2.Q) {
                    Runnable runnable = kc0Var.f36887c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.cz.f23436r == 1 && qc0Var2.f38890y.getVisibility() != 0 && (editTextBoldCursor = qc0Var2.f38886r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(qc0Var2.f38886r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
