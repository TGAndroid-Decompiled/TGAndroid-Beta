package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f27529a;
    public final kg0 f27530b;

    public jg0(kg0 kg0Var, int i10) {
        this.f27529a = i10;
        this.f27530b = kg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27529a) {
            case 0:
                this.f27530b.f27877a.f28158n.setVisibility(8);
                return;
            default:
                this.f27530b.f27877a.h.setVisibility(8);
                return;
        }
    }
}
