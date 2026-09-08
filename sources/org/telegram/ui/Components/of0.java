package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29070a;
    public final pf0 f29071b;

    public of0(pf0 pf0Var, int i10) {
        this.f29070a = i10;
        this.f29071b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29070a) {
            case 0:
                this.f29071b.f29394a.f29739n.setVisibility(8);
                return;
            default:
                this.f29071b.f29394a.h.setVisibility(8);
                return;
        }
    }
}
