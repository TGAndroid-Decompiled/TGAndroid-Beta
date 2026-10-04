package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32311a;

    public z(u uVar) {
        this.f32311a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32311a.E = false;
    }
}
