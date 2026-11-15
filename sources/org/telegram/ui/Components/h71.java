package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h71 extends AnimatorListenerAdapter {
    public final int f35190a;
    public final i71 f35191b;

    public h71(i71 i71Var, int i7) {
        this.f35190a = i7;
        this.f35191b = i71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35190a) {
            case 0:
                this.f35191b.E = null;
                return;
            default:
                this.f35191b.E = null;
                return;
        }
    }
}
