package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f34109a;
    public final q2 f34110b;

    public p2(q2 q2Var, int i10) {
        this.f34109a = i10;
        this.f34110b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34109a) {
            case 0:
                this.f34110b.f34138b.setVisibility(8);
                return;
            default:
                this.f34110b.f34139c.setVisibility(8);
                return;
        }
    }
}
