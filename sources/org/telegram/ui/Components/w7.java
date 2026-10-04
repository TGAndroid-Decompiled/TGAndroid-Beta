package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w7 extends AnimatorListenerAdapter {
    public final int f32479a;
    public final j8 f32480b;

    public w7(j8 j8Var, int i10) {
        this.f32479a = i10;
        this.f32480b = j8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32479a) {
            case 2:
                this.f32480b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32479a) {
            case 0:
                this.f32480b.m0 = false;
                return;
            case 1:
                j8 j8Var = this.f32480b;
                j8Var.f27639i0.setVisibility(4);
                j8Var.f27640j0.setImageBitmap(null);
                j8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
