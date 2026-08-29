package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u7 extends AnimatorListenerAdapter {
    public final int f33151a;
    public final g8 f33152b;

    public u7(g8 g8Var, int i10) {
        this.f33151a = i10;
        this.f33152b = g8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33151a) {
            case 2:
                this.f33152b.f28809y0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33151a) {
            case 0:
                this.f33152b.f28788i0 = false;
                return;
            case 1:
                g8 g8Var = this.f33152b;
                g8Var.f28783e0.setVisibility(4);
                g8Var.f28785f0.setImageBitmap(null);
                g8Var.f28788i0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
