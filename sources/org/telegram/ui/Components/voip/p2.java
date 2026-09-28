package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29472a;
    public final q2 f29473b;

    public p2(q2 q2Var, int i10) {
        this.f29472a = i10;
        this.f29473b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29472a) {
            case 0:
                this.f29473b.f29495b.setVisibility(8);
                return;
            default:
                this.f29473b.f29496c.setVisibility(8);
                return;
        }
    }
}
