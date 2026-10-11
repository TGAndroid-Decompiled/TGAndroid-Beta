package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y7 extends AnimatorListenerAdapter {
    public final int f33161a;
    public final l8 f33162b;

    public y7(l8 l8Var, int i10) {
        this.f33161a = i10;
        this.f33162b = l8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33161a) {
            case 2:
                this.f33162b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33161a) {
            case 0:
                this.f33162b.m0 = false;
                return;
            case 1:
                l8 l8Var = this.f33162b;
                l8Var.f28240i0.setVisibility(4);
                l8Var.f28241j0.setImageBitmap(null);
                l8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
