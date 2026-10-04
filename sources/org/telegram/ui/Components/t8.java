package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f30990a;
    public final e9 f30991b;

    public t8(e9 e9Var, int i10) {
        this.f30990a = i10;
        this.f30991b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30990a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30991b.f26008f = false;
                return;
            default:
                e9 e9Var = this.f30991b;
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
