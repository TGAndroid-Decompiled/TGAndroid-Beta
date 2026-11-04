package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd0 extends AnimatorListenerAdapter {
    public final int f37987a;
    public final td0 f37988b;

    public sd0(td0 td0Var, int i3) {
        this.f37987a = i3;
        this.f37988b = td0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37987a) {
            case 0:
                this.f37988b.f38396a.f38724n.setVisibility(8);
                return;
            default:
                this.f37988b.f38396a.h.setVisibility(8);
                return;
        }
    }
}
