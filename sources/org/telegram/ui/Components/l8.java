package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l8 extends AnimatorListenerAdapter {
    public final int f30394a;
    public final w8 f30395b;

    public l8(w8 w8Var, int i9) {
        this.f30394a = i9;
        this.f30395b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f30394a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30395b.f34142f = false;
                return;
            default:
                w8 w8Var = this.f30395b;
                if (w8Var.B) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.h0(f10, false);
                w8Var.B = false;
                return;
        }
    }
}
