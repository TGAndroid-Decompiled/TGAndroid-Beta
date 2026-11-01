package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rc0 extends AnimatorListenerAdapter {
    public final int f29976a;
    public final sc0 f29977b;

    public rc0(sc0 sc0Var, int i10) {
        this.f29976a = i10;
        this.f29977b = sc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29976a) {
            case 0:
                zc0 zc0Var = this.f29977b.d;
                if (!zc0Var.P) {
                    zc0Var.f33103a0 = 1.0f;
                    zc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                sc0 sc0Var = this.f29977b;
                zc0 zc0Var2 = sc0Var.d;
                if (!zc0Var2.P) {
                    Runnable runnable = sc0Var.f30267c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.uz.f18546r == 1 && zc0Var2.f33119y.getVisibility() != 0 && (editTextBoldCursor = zc0Var2.f33115r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(zc0Var2.f33115r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
