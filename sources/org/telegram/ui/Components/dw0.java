package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dw0 extends AnimatorListenerAdapter {
    public final int f25604a;
    public final ew0 f25605b;

    public dw0(ew0 ew0Var, int i10) {
        this.f25604a = i10;
        this.f25605b = ew0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25604a) {
            case 0:
                this.f25605b.f25952s.setVisibility(8);
                return;
            case 1:
                this.f25605b.f25952s.setVisibility(8);
                return;
            default:
                this.f25605b.f25952s.setVisibility(8);
                return;
        }
    }
}
