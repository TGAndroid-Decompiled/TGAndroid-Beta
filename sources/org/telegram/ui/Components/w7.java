package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w7 extends AnimatorListenerAdapter {
    public final int f28668a;
    public final j8 f28669b;

    public w7(j8 j8Var, int i10) {
        this.f28668a = i10;
        this.f28669b = j8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28668a) {
            case 2:
                this.f28669b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28668a) {
            case 0:
                this.f28669b.m0 = false;
                return;
            case 1:
                j8 j8Var = this.f28669b;
                j8Var.f24287i0.setVisibility(4);
                j8Var.f24288j0.setImageBitmap(null);
                j8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
