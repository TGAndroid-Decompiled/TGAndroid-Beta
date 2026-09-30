package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29469a;
    public final q2 f29470b;

    public p2(q2 q2Var, int i10) {
        this.f29469a = i10;
        this.f29470b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29469a) {
            case 0:
                this.f29470b.f29492b.setVisibility(8);
                return;
            default:
                this.f29470b.f29493c.setVisibility(8);
                return;
        }
    }
}
