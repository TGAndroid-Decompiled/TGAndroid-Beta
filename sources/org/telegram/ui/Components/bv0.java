package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bv0 extends AnimatorListenerAdapter {
    public final int f33395a;
    public final cv0 f33396b;

    public bv0(cv0 cv0Var, int i7) {
        this.f33395a = i7;
        this.f33396b = cv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33395a) {
            case 0:
                this.f33396b.f33713s.setVisibility(8);
                return;
            case 1:
                this.f33396b.f33713s.setVisibility(8);
                return;
            default:
                this.f33396b.f33713s.setVisibility(8);
                return;
        }
    }
}
