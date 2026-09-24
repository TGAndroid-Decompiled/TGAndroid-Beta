package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29542a;
    public final q2 f29543b;

    public p2(q2 q2Var, int i10) {
        this.f29542a = i10;
        this.f29543b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29542a) {
            case 0:
                this.f29543b.f29565b.setVisibility(8);
                return;
            default:
                this.f29543b.f29566c.setVisibility(8);
                return;
        }
    }
}
