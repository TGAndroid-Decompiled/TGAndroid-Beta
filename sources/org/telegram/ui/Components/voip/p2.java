package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29468a;
    public final q2 f29469b;

    public p2(q2 q2Var, int i10) {
        this.f29468a = i10;
        this.f29469b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29468a) {
            case 0:
                this.f29469b.f29491b.setVisibility(8);
                return;
            default:
                this.f29469b.f29492c.setVisibility(8);
                return;
        }
    }
}
