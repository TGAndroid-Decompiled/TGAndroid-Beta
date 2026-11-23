package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f37604a;
    public final nv0 f37605b;

    public mv0(nv0 nv0Var, int i7) {
        this.f37604a = i7;
        this.f37605b = nv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37604a) {
            case 0:
                this.f37605b.f37966s.setVisibility(8);
                return;
            case 1:
                this.f37605b.f37966s.setVisibility(8);
                return;
            default:
                this.f37605b.f37966s.setVisibility(8);
                return;
        }
    }
}
