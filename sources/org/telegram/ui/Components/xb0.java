package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xb0 extends AnimatorListenerAdapter {
    public final int f40248a;
    public final yb0 f40249b;

    public xb0(yb0 yb0Var, int i7) {
        this.f40248a = i7;
        this.f40249b = yb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40248a) {
            case 0:
                ec0 ec0Var = this.f40249b.d;
                if (!ec0Var.P) {
                    ec0Var.f33195a0 = 1.0f;
                    ec0Var.h(1.0f);
                    return;
                }
                return;
            default:
                yb0 yb0Var = this.f40249b;
                ec0 ec0Var2 = yb0Var.d;
                if (!ec0Var2.P) {
                    Runnable runnable = yb0Var.f40606c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.iz.f23403r == 1 && ec0Var2.f33212y.getVisibility() != 0 && (editTextBoldCursor = ec0Var2.f33208r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(ec0Var2.f33208r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
