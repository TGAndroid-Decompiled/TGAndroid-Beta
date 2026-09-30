package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29683a;

    public z(u uVar) {
        this.f29683a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29683a.E = false;
    }
}
