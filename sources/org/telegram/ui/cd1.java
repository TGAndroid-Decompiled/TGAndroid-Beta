package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final int f35937a;
    public final gd1 f35938b;

    public cd1(gd1 gd1Var, int i10) {
        this.f35937a = i10;
        this.f35938b = gd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35937a) {
            case 0:
                gd1 gd1Var = this.f35938b;
                gd1Var.v = 0;
                gd1Var.f37282n.setVisibility(8);
                return;
            case 1:
                this.f35938b.v = 0;
                return;
            default:
                this.f35938b.F.setVisibility(8);
                return;
        }
    }
}
