package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f20467a;
    public final u0 f20468b;

    public k0(u0 u0Var, int i10) {
        this.f20467a = i10;
        this.f20468b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20467a) {
            case 0:
                u0 u0Var = this.f20468b;
                u0Var.f20696s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f20468b.v = null;
                return;
        }
    }
}
