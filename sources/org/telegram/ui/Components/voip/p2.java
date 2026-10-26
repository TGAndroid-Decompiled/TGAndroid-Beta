package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f34004a;
    public final q2 f34005b;

    public p2(q2 q2Var, int i10) {
        this.f34004a = i10;
        this.f34005b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34004a) {
            case 0:
                this.f34005b.f34033b.setVisibility(8);
                return;
            default:
                this.f34005b.f34034c.setVisibility(8);
                return;
        }
    }
}
