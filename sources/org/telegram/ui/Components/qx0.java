package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qx0 extends AnimatorListenerAdapter {
    public final int f29775a;
    public final rx0 f29776b;

    public qx0(rx0 rx0Var, int i10) {
        this.f29775a = i10;
        this.f29776b = rx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29775a) {
            case 0:
                this.f29776b.f30076s.setVisibility(8);
                return;
            case 1:
                this.f29776b.f30076s.setVisibility(8);
                return;
            default:
                this.f29776b.f30076s.setVisibility(8);
                return;
        }
    }
}
