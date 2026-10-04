package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32317a;

    public z(u uVar) {
        this.f32317a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32317a.E = false;
    }
}
