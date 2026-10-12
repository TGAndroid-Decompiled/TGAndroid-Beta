package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y7 extends AnimatorListenerAdapter {
    public final int f32960a;
    public final l8 f32961b;

    public y7(l8 l8Var, int i10) {
        this.f32960a = i10;
        this.f32961b = l8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32960a) {
            case 2:
                this.f32961b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32960a) {
            case 0:
                this.f32961b.m0 = false;
                return;
            case 1:
                l8 l8Var = this.f32961b;
                l8Var.f28065i0.setVisibility(4);
                l8Var.f28066j0.setImageBitmap(null);
                l8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
