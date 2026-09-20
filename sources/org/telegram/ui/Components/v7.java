package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v7 extends AnimatorListenerAdapter {
    public final int f28961a;
    public final i8 f28962b;

    public v7(i8 i8Var, int i10) {
        this.f28961a = i10;
        this.f28962b = i8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28961a) {
            case 2:
                this.f28962b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28961a) {
            case 0:
                this.f28962b.m0 = false;
                return;
            case 1:
                i8 i8Var = this.f28962b;
                i8Var.f24920i0.setVisibility(4);
                i8Var.f24921j0.setImageBitmap(null);
                i8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
