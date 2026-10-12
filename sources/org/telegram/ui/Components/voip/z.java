package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final v f32125a;

    public z(v vVar) {
        this.f32125a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32125a.E = false;
    }
}
