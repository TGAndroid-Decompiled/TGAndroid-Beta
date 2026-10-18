package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qx0 extends AnimatorListenerAdapter {
    public final int f29774a;
    public final rx0 f29775b;

    public qx0(rx0 rx0Var, int i10) {
        this.f29774a = i10;
        this.f29775b = rx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29774a) {
            case 0:
                this.f29775b.f30078s.setVisibility(8);
                return;
            case 1:
                this.f29775b.f30078s.setVisibility(8);
                return;
            default:
                this.f29775b.f30078s.setVisibility(8);
                return;
        }
    }
}
