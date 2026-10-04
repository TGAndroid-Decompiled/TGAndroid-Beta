package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w7 extends AnimatorListenerAdapter {
    public final int f32473a;
    public final j8 f32474b;

    public w7(j8 j8Var, int i10) {
        this.f32473a = i10;
        this.f32474b = j8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32473a) {
            case 2:
                this.f32474b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32473a) {
            case 0:
                this.f32474b.m0 = false;
                return;
            case 1:
                j8 j8Var = this.f32474b;
                j8Var.f27634i0.setVisibility(4);
                j8Var.f27635j0.setImageBitmap(null);
                j8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
