package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u7 extends AnimatorListenerAdapter {
    public final int f28306a;
    public final h8 f28307b;

    public u7(h8 h8Var, int i10) {
        this.f28306a = i10;
        this.f28307b = h8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28306a) {
            case 2:
                this.f28307b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28306a) {
            case 0:
                this.f28307b.m0 = false;
                return;
            case 1:
                h8 h8Var = this.f28307b;
                h8Var.f24562i0.setVisibility(4);
                h8Var.f24563j0.setImageBitmap(null);
                h8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
