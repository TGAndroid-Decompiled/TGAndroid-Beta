package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rc0 extends AnimatorListenerAdapter {
    public final int f29898a;
    public final sc0 f29899b;

    public rc0(sc0 sc0Var, int i10) {
        this.f29898a = i10;
        this.f29899b = sc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29898a) {
            case 0:
                zc0 zc0Var = this.f29899b.d;
                if (!zc0Var.P) {
                    zc0Var.f33007a0 = 1.0f;
                    zc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                sc0 sc0Var = this.f29899b;
                zc0 zc0Var2 = sc0Var.d;
                if (!zc0Var2.P) {
                    Runnable runnable = sc0Var.f30221c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.tz.f18177r == 1 && zc0Var2.f33023y.getVisibility() != 0 && (editTextBoldCursor = zc0Var2.f33019r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(zc0Var2.f33019r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
