package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32384a;

    public z(u uVar) {
        this.f32384a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32384a.E = false;
    }
}
