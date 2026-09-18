package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29351a;

    public z(u uVar) {
        this.f29351a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29351a.E = false;
    }
}
