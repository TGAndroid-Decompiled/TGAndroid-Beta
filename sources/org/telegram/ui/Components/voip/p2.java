package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f34001a;
    public final q2 f34002b;

    public p2(q2 q2Var, int i10) {
        this.f34001a = i10;
        this.f34002b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34001a) {
            case 0:
                this.f34002b.f34030b.setVisibility(8);
                return;
            default:
                this.f34002b.f34031c.setVisibility(8);
                return;
        }
    }
}
