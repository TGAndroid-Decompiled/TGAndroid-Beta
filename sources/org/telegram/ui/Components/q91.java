package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q91 extends AnimatorListenerAdapter {
    public final int f29572a;
    public final r91 f29573b;

    public q91(r91 r91Var, int i10) {
        this.f29572a = i10;
        this.f29573b = r91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29572a) {
            case 0:
                this.f29573b.f29913y = null;
                return;
            default:
                this.f29573b.f29913y = null;
                return;
        }
    }
}
