package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f27530a;
    public final kg0 f27531b;

    public jg0(kg0 kg0Var, int i10) {
        this.f27530a = i10;
        this.f27531b = kg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27530a) {
            case 0:
                this.f27531b.f27878a.f28159n.setVisibility(8);
                return;
            default:
                this.f27531b.f27878a.h.setVisibility(8);
                return;
        }
    }
}
