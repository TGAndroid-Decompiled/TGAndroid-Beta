package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f30997a;
    public final e9 f30998b;

    public t8(e9 e9Var, int i10) {
        this.f30997a = i10;
        this.f30998b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30997a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30998b.f26014f = false;
                return;
            default:
                e9 e9Var = this.f30998b;
                if (e9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                e9Var.F = false;
                return;
        }
    }
}
