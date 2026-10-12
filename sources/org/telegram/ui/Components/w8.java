package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w8 extends AnimatorListenerAdapter {
    public final int f30814a;
    public final h9 f30815b;

    public w8(h9 h9Var, int i10) {
        this.f30814a = i10;
        this.f30815b = h9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30814a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30815b.f25569f = false;
                return;
            default:
                h9 h9Var = this.f30815b;
                if (h9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                h9Var.i0(f7, false);
                h9Var.F = false;
                return;
        }
    }
}
