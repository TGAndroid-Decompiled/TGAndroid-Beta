package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x7 extends AnimatorListenerAdapter {
    public final int f32363a;
    public final k8 f32364b;

    public x7(k8 k8Var, int i10) {
        this.f32363a = i10;
        this.f32364b = k8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32363a) {
            case 2:
                this.f32364b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32363a) {
            case 0:
                this.f32364b.m0 = false;
                return;
            case 1:
                k8 k8Var = this.f32364b;
                k8Var.f27790i0.setVisibility(4);
                k8Var.f27791j0.setImageBitmap(null);
                k8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
