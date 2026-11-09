package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yb0 extends AnimatorListenerAdapter {
    public final int f40695a;
    public final zb0 f40696b;

    public yb0(zb0 zb0Var, int i7) {
        this.f40695a = i7;
        this.f40696b = zb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40695a) {
            case 0:
                fc0 fc0Var = this.f40696b.d;
                if (!fc0Var.P) {
                    fc0Var.f33619a0 = 1.0f;
                    fc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                zb0 zb0Var = this.f40696b;
                fc0 fc0Var2 = zb0Var.d;
                if (!fc0Var2.P) {
                    Runnable runnable = zb0Var.f40954c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.iz.f23431r == 1 && fc0Var2.f33636y.getVisibility() != 0 && (editTextBoldCursor = fc0Var2.f33632r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(fc0Var2.f33632r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
