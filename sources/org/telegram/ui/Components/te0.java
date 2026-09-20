package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class te0 extends AnimatorListenerAdapter {
    public final int f28365a;
    public final xe0 f28366b;

    public te0(xe0 xe0Var, int i10) {
        this.f28365a = i10;
        this.f28366b = xe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28365a) {
            case 0:
                this.f28366b.f30254x = null;
                return;
            default:
                this.f28366b.f30255y = null;
                return;
        }
    }
}
