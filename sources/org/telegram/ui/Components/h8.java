package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f34245a;
    public final s8 f34246b;

    public h8(s8 s8Var, int i7) {
        this.f34245a = i7;
        this.f34246b = s8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f34245a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34246b.f37893f = false;
                return;
            default:
                s8 s8Var = this.f34246b;
                if (s8Var.F) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                s8Var.n0(false, f10);
                s8Var.F = false;
                return;
        }
    }
}
