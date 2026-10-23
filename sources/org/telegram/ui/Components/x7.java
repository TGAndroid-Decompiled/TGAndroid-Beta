package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x7 extends AnimatorListenerAdapter {
    public final int f32449a;
    public final k8 f32450b;

    public x7(k8 k8Var, int i10) {
        this.f32449a = i10;
        this.f32450b = k8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32449a) {
            case 2:
                this.f32450b.B0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32449a) {
            case 0:
                this.f32450b.f27928l0 = false;
                return;
            case 1:
                k8 k8Var = this.f32450b;
                k8Var.f27924h0.setVisibility(4);
                k8Var.f27925i0.setImageBitmap(null);
                k8Var.f27928l0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
