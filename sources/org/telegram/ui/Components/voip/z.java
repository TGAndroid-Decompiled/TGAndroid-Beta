package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29714a;

    public z(u uVar) {
        this.f29714a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29714a.E = false;
    }
}
