package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32458a;

    public z(u uVar) {
        this.f32458a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32458a.E = false;
    }
}
