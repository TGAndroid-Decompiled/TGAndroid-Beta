package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t7 extends AnimatorListenerAdapter {
    public final int f39929a;
    public final g8 f39930b;

    public t7(g8 g8Var, int i7) {
        this.f39929a = i7;
        this.f39930b = g8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39929a) {
            case 2:
                this.f39930b.f35417w2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39929a) {
            case 0:
                this.f39930b.f35391g2 = false;
                return;
            case 1:
                g8 g8Var = this.f39930b;
                g8Var.f35388c2.setVisibility(4);
                g8Var.d2.setImageBitmap(null);
                g8Var.f35391g2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
