package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yb0 extends AnimatorListenerAdapter {
    public final int f41970a;
    public final zb0 f41971b;

    public yb0(zb0 zb0Var, int i7) {
        this.f41970a = i7;
        this.f41971b = zb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f41970a) {
            case 0:
                fc0 fc0Var = this.f41971b.d;
                if (!fc0Var.Q) {
                    fc0Var.f34567b0 = 1.0f;
                    fc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                zb0 zb0Var = this.f41971b;
                fc0 fc0Var2 = zb0Var.d;
                if (!fc0Var2.Q) {
                    Runnable runnable = zb0Var.f42332c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.gz.f23978r == 1 && fc0Var2.f34583y.getVisibility() != 0 && (editTextBoldCursor = fc0Var2.f34579r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.J3(fc0Var2.f34579r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
