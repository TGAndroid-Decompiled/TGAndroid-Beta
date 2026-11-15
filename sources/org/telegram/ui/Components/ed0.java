package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed0 extends AnimatorListenerAdapter {
    public final int f34276a;
    public final gd0 f34277b;

    public ed0(gd0 gd0Var, int i7) {
        this.f34276a = i7;
        this.f34277b = gd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34276a) {
            case 0:
                this.f34277b.f34913s = null;
                return;
            default:
                this.f34277b.f34914w = null;
                return;
        }
    }
}
