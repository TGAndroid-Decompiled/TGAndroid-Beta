package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sx0 extends AnimatorListenerAdapter {
    public final int f30371a;
    public final tx0 f30372b;

    public sx0(tx0 tx0Var, int i10) {
        this.f30371a = i10;
        this.f30372b = tx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30371a) {
            case 0:
                this.f30372b.f30702s.setVisibility(8);
                return;
            case 1:
                this.f30372b.f30702s.setVisibility(8);
                return;
            default:
                this.f30372b.f30702s.setVisibility(8);
                return;
        }
    }
}
