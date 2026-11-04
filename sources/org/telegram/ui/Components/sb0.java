package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sb0 extends AnimatorListenerAdapter {
    public final int f37964a;
    public final tb0 f37965b;

    public sb0(tb0 tb0Var, int i3) {
        this.f37964a = i3;
        this.f37965b = tb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37964a) {
            case 0:
                zb0 zb0Var = this.f37965b.d;
                if (!zb0Var.Q) {
                    zb0Var.f41001b0 = 1.0f;
                    zb0Var.h(1.0f);
                    return;
                }
                return;
            default:
                tb0 tb0Var = this.f37965b;
                zb0 zb0Var2 = tb0Var.d;
                if (!zb0Var2.Q) {
                    Runnable runnable = tb0Var.f38387c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.az.f21658r == 1 && zb0Var2.f41017y.getVisibility() != 0 && (editTextBoldCursor = zb0Var2.f41013r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(zb0Var2.f41013r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
