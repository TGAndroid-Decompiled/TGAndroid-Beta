package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x7 extends AnimatorListenerAdapter {
    public final int f32468a;
    public final k8 f32469b;

    public x7(k8 k8Var, int i10) {
        this.f32468a = i10;
        this.f32469b = k8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32468a) {
            case 2:
                this.f32469b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32468a) {
            case 0:
                this.f32469b.m0 = false;
                return;
            case 1:
                k8 k8Var = this.f32469b;
                k8Var.f27753i0.setVisibility(4);
                k8Var.f27754j0.setImageBitmap(null);
                k8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
