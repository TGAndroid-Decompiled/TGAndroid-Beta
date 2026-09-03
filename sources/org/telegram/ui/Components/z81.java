package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z81 extends AnimatorListenerAdapter {
    public final int f33872a;
    public final a91 f33873b;

    public z81(a91 a91Var, int i10) {
        this.f33872a = i10;
        this.f33873b = a91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33872a) {
            case 0:
                this.f33873b.f25205y = null;
                return;
            default:
                this.f33873b.f25205y = null;
                return;
        }
    }
}
