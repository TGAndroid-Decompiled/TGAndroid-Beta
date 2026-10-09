package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qg0 extends AnimatorListenerAdapter {
    public final int f30163a;
    public final rg0 f30164b;

    public qg0(rg0 rg0Var, int i10) {
        this.f30163a = i10;
        this.f30164b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30163a) {
            case 0:
                this.f30164b.f30440a.f30787n.setVisibility(8);
                return;
            default:
                this.f30164b.f30440a.h.setVisibility(8);
                return;
        }
    }
}
