package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xb0 extends AnimatorListenerAdapter {
    public final int f40282a;
    public final yb0 f40283b;

    public xb0(yb0 yb0Var, int i7) {
        this.f40282a = i7;
        this.f40283b = yb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40282a) {
            case 0:
                ec0 ec0Var = this.f40283b.d;
                if (!ec0Var.P) {
                    ec0Var.f33205a0 = 1.0f;
                    ec0Var.h(1.0f);
                    return;
                }
                return;
            default:
                yb0 yb0Var = this.f40283b;
                ec0 ec0Var2 = yb0Var.d;
                if (!ec0Var2.P) {
                    Runnable runnable = yb0Var.f40550c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.iz.f23435r == 1 && ec0Var2.f33222y.getVisibility() != 0 && (editTextBoldCursor = ec0Var2.f33218r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(ec0Var2.f33218r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
