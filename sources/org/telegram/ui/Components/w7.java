package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w7 extends AnimatorListenerAdapter {
    public final int f29558a;
    public final j8 f29559b;

    public w7(j8 j8Var, int i10) {
        this.f29558a = i10;
        this.f29559b = j8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29558a) {
            case 2:
                this.f29559b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29558a) {
            case 0:
                this.f29559b.m0 = false;
                return;
            case 1:
                j8 j8Var = this.f29559b;
                j8Var.f25173i0.setVisibility(4);
                j8Var.f25174j0.setImageBitmap(null);
                j8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
