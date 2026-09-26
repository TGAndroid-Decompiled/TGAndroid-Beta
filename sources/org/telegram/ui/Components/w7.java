package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w7 extends AnimatorListenerAdapter {
    public final int f29915a;
    public final j8 f29916b;

    public w7(j8 j8Var, int i10) {
        this.f29915a = i10;
        this.f29916b = j8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29915a) {
            case 2:
                this.f29916b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29915a) {
            case 0:
                this.f29916b.m0 = false;
                return;
            case 1:
                j8 j8Var = this.f29916b;
                j8Var.f25296i0.setVisibility(4);
                j8Var.f25297j0.setImageBitmap(null);
                j8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
