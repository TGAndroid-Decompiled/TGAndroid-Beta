package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29689a;

    public z(u uVar) {
        this.f29689a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29689a.E = false;
    }
}
