package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y7 extends AnimatorListenerAdapter {
    public final int f33102a;
    public final l8 f33103b;

    public y7(l8 l8Var, int i10) {
        this.f33102a = i10;
        this.f33103b = l8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33102a) {
            case 2:
                this.f33103b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33102a) {
            case 0:
                this.f33103b.m0 = false;
                return;
            case 1:
                l8 l8Var = this.f33103b;
                l8Var.f28208i0.setVisibility(4);
                l8Var.f28209j0.setImageBitmap(null);
                l8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
