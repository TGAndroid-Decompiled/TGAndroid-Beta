package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x7 extends AnimatorListenerAdapter {
    public final int f32341a;
    public final k8 f32342b;

    public x7(k8 k8Var, int i10) {
        this.f32341a = i10;
        this.f32342b = k8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32341a) {
            case 2:
                this.f32342b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32341a) {
            case 0:
                this.f32342b.m0 = false;
                return;
            case 1:
                k8 k8Var = this.f32342b;
                k8Var.f27782i0.setVisibility(4);
                k8Var.f27783j0.setImageBitmap(null);
                k8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
