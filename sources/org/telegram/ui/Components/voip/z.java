package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29774a;

    public z(u uVar) {
        this.f29774a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29774a.E = false;
    }
}
