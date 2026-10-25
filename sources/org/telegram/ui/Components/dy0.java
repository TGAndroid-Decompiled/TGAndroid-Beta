package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dy0 extends AnimatorListenerAdapter {
    public final int f27633a;
    public final ey0 f27634b;

    public dy0(ey0 ey0Var, int i10) {
        this.f27633a = i10;
        this.f27634b = ey0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27633a) {
            case 0:
                this.f27634b.f28018s.setVisibility(8);
                return;
            case 1:
                this.f27634b.f28018s.setVisibility(8);
                return;
            default:
                this.f27634b.f28018s.setVisibility(8);
                return;
        }
    }
}
