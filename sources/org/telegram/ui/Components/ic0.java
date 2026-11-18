package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ic0 extends AnimatorListenerAdapter {
    public final int f36102a;
    public final jc0 f36103b;

    public ic0(jc0 jc0Var, int i7) {
        this.f36102a = i7;
        this.f36103b = jc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36102a) {
            case 0:
                pc0 pc0Var = this.f36103b.d;
                if (!pc0Var.Q) {
                    pc0Var.f38363b0 = 1.0f;
                    pc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                jc0 jc0Var = this.f36103b;
                pc0 pc0Var2 = jc0Var.d;
                if (!pc0Var2.Q) {
                    Runnable runnable = jc0Var.f36406c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.bz.f23191r == 1 && pc0Var2.f38379y.getVisibility() != 0 && (editTextBoldCursor = pc0Var2.f38375r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(pc0Var2.f38375r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
