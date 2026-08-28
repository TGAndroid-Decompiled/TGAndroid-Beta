package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p7 extends AnimatorListenerAdapter {
    public final int f31563a;
    public final c8 f31564b;

    public p7(c8 c8Var, int i9) {
        this.f31563a = i9;
        this.f31564b = c8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31563a) {
            case 2:
                this.f31564b.f27411y0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31563a) {
            case 0:
                this.f31564b.f27390i0 = false;
                return;
            case 1:
                c8 c8Var = this.f31564b;
                c8Var.f27385e0.setVisibility(4);
                c8Var.f27387f0.setImageBitmap(null);
                c8Var.f27390i0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
