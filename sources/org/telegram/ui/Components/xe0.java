package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f34668a;
    public final ye0 f34669b;

    public xe0(ye0 ye0Var, int i9) {
        this.f34668a = i9;
        this.f34669b = ye0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34668a) {
            case 0:
                this.f34669b.f34958a.f35291n.setVisibility(8);
                return;
            default:
                this.f34669b.f34958a.h.setVisibility(8);
                return;
        }
    }
}
