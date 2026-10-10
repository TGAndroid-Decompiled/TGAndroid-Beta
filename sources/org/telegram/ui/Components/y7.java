package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y7 extends AnimatorListenerAdapter {
    public final int f33119a;
    public final l8 f33120b;

    public y7(l8 l8Var, int i10) {
        this.f33119a = i10;
        this.f33120b = l8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33119a) {
            case 2:
                this.f33120b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33119a) {
            case 0:
                this.f33120b.m0 = false;
                return;
            case 1:
                l8 l8Var = this.f33120b;
                l8Var.f28201i0.setVisibility(4);
                l8Var.f28202j0.setImageBitmap(null);
                l8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
