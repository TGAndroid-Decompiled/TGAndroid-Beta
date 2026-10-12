package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z7 extends AnimatorListenerAdapter {
    public final int f31785a;
    public final m8 f31786b;

    public z7(m8 m8Var, int i10) {
        this.f31785a = i10;
        this.f31786b = m8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31785a) {
            case 2:
                this.f31786b.C0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31785a) {
            case 0:
                this.f31786b.m0 = false;
                return;
            case 1:
                m8 m8Var = this.f31786b;
                m8Var.f27244i0.setVisibility(4);
                m8Var.f27245j0.setImageBitmap(null);
                m8Var.m0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
