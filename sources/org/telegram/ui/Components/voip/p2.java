package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29552a;
    public final q2 f29553b;

    public p2(q2 q2Var, int i10) {
        this.f29552a = i10;
        this.f29553b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29552a) {
            case 0:
                this.f29553b.f29575b.setVisibility(8);
                return;
            default:
                this.f29553b.f29576c.setVisibility(8);
                return;
        }
    }
}
