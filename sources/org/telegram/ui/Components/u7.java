package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u7 extends AnimatorListenerAdapter {
    public final int f28288a;
    public final h8 f28289b;

    public u7(h8 h8Var, int i10) {
        this.f28288a = i10;
        this.f28289b = h8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28288a) {
            case 2:
                this.f28289b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28288a) {
            case 0:
                this.f28289b.m0 = false;
                return;
            case 1:
                h8 h8Var = this.f28289b;
                h8Var.f24554i0.setVisibility(4);
                h8Var.f24555j0.setImageBitmap(null);
                h8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
