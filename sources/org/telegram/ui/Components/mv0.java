package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f37651a;
    public final nv0 f37652b;

    public mv0(nv0 nv0Var, int i7) {
        this.f37651a = i7;
        this.f37652b = nv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37651a) {
            case 0:
                this.f37652b.f37995s.setVisibility(8);
                return;
            case 1:
                this.f37652b.f37995s.setVisibility(8);
                return;
            default:
                this.f37652b.f37995s.setVisibility(8);
                return;
        }
    }
}
