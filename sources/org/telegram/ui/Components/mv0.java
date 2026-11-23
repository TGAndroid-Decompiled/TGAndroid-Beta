package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f37649a;
    public final nv0 f37650b;

    public mv0(nv0 nv0Var, int i7) {
        this.f37649a = i7;
        this.f37650b = nv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37649a) {
            case 0:
                this.f37650b.f38000s.setVisibility(8);
                return;
            case 1:
                this.f37650b.f38000s.setVisibility(8);
                return;
            default:
                this.f37650b.f38000s.setVisibility(8);
                return;
        }
    }
}
